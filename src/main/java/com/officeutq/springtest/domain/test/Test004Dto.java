package com.officeutq.springtest.domain.test;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"indexTitle",
		"indexExp",
		"indexDate",
		"indexMemo",
		"screenId"
})
public class Test004Dto {
	
	@JsonProperty("indexTitle")
	public String indexTitle;
	
	@JsonProperty("indexExp")
	public String indexExp;
	
	@JsonProperty("indexDate")
	public String indexDate;
	
	@JsonProperty("indexMemo")
	public String indexMemo;
	
	@JsonProperty("screenId")
	public String screenId;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }}
