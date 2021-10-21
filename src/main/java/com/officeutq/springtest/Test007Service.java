package com.officeutq.springtest;

import java.io.BufferedReader;
import java.io.StringReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.officeutq.springtest.domain.mybatis.IndexList;
import com.officeutq.springtest.domain.mybatis.IndexListExample;
import com.officeutq.springtest.domain.test.Test007ResultDto;
import com.officeutq.springtest.mapper.mybatis.IndexListMapper;

@Service
public class Test007Service {
	
	@Autowired
	private IndexListMapper indexListMapper;

    public IndexList findThisPart(String screenId) {
    	IndexListExample example = new IndexListExample();
    	example.createCriteria().andScreenIdEqualTo(screenId);
    	List<IndexList> list = indexListMapper.selectByExample(example);
    	return list.get(0);
    }
    
    public List<Test007ResultDto> resultDto(){
    	List<Test007ResultDto> list = new ArrayList<>();
    	Test007ResultDto result1 = new Test007ResultDto();
    	// 例題
    	result1.setColumn("かっこいい");
    	result1.setResult(MessageFormat.format("{0}", count(10)));
    	list.add(result1);
    	Test007ResultDto result2 = new Test007ResultDto();
    	result2.setColumn("上書き");
    	result2.setResult(MessageFormat.format("{0}", uwagaki(30, "ryfoxchyvfmsewlwpoyvhdjkbvdjsa")));
       	list.add(result2);
    	Test007ResultDto result3 = new Test007ResultDto();
    	result3.setColumn("てすと１");
    	int[] foo = {-1, -3};
    	result3.setResult(MessageFormat.format("{0}", solution(foo)));
       	list.add(result3);
		Test007ResultDto result4 = new Test007ResultDto();
		String[] foo2 = {"3", "3", "4", "5", "1", "null", "null"};
    	result4.setColumn("本番１");
		result4.setResult(MessageFormat.format("{0}", solution(foo2)));
		list.add(result4);
		Test007ResultDto result5 = new Test007ResultDto();
		result5.setColumn("本番2");
		result5.setResult(MessageFormat.format("{0}", solution(3, 3, "1 1 2 3 4 3 3 1 2")));
		list.add(result5);
		Test007ResultDto result6 = new Test007ResultDto();
		result6.setColumn("本番4");
		String[] foo3 = {"3 200 http1", "3 200 http2", "2 200 http3", "2 200 http3"};
		result6.setResult(MessageFormat.format("{0}", String.join(",", solution(3, foo3))));
		list.add(result6);
		return list;
	}

    private String uwagaki(int n, String S) {
//		String T = "";
//		for (int i = 0; i < n; i++) {
//			String c = S.substring(i, i + 1);
//			T = T.replace(c, "") + c;
//		}
//		return T;
		StringBuilder sb = new StringBuilder();
		Arrays.stream(S.split("")).forEachOrdered(arr -> sb.replace(0, n, sb.toString().replace(arr, "") + arr));
		return sb.toString();
	}

	/**
     * 例題
     * 
     * @param n
     * @return
     */
    private int count(int n) {
    	return IntStream.rangeClosed(1, n)
    			.filter(i -> i % 5 != 0)
    			.sum();
    }

    private int solution(int[] A) {
    	int result = 1;
    	for (int i : Arrays.stream(A).sorted().filter(i -> i > 0).distinct().toArray()) {
    		if (i != result) {
    			break;
    		}
    		result++;
     	}
    	return result;
    }

    private int maxMinProduct(TreeNode root){
        // write your code in Java 8
    	boolean flag = false;
    	int min = 1;
    	int max = 1;
    	do{
    		int a = root.val * root.left.val;
    		int b = root.val * root.right.val;
    	} while(flag);
    	int result = 0;
    	return result;
    }
    
    public int solution(String[] A) {
        return maxMinProduct(new TreeNode(A));
    }
    
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        public TreeNode(String[] vals) {
            val = Integer.parseInt(vals[0]);
            left = constructFromArray(vals, 1);
            right = constructFromArray(vals, 2);
        }

        private TreeNode constructFromArray(String[] vals, int k) {
            if (k >= vals.length || vals[k].equals("null")) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(vals[k]));
            int leftIndex = 2 * k + 1;
            root.left = constructFromArray(vals, leftIndex);
            int rightIndex = 2 * k + 2;
            root.right = constructFromArray(vals, rightIndex);
            return root;
        }
    }
    // map is a 2D array
    int minimumCost(int[][] map){
        // write your code in Java 8
        return -1;
    }
    
    // The following may not need to be modified
    public int solution(int rows, int cols, String input) {
        int[][] costs = new int[rows][cols];
        final Scanner in = new Scanner(new BufferedReader(new StringReader(input)));
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                costs[i][j] = in.nextInt();
            }
        }
        return minimumCost(costs);
    }

    class AccessLog {
    	private String ip;
    	private String code;
    	private String url;

		public AccessLog(String ip, String code, String url) {
			this.ip = ip;
			this.code = code;
			this.url = url;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
    }

    public String[] solution(int n, String[] logs) {
        // write your code in Java 8
    	List<String> logList = new ArrayList<> (Arrays.asList(logs));
    	List<AccessLog> list = new ArrayList<> ();
    	for (String log : logList) {
    		AccessLog al = new AccessLog(log.split(" ")[0], log.split(" ")[1], log.split(" ")[2]);
    		list.add(al);
    	}
    	return (String[]) list.stream().sorted(Comparator.comparing(e -> e.getUrl())).filter(e -> e.getCode().equals("200")).toArray();
 //   	String[] result = null;
 //   	return result;
    }

}
