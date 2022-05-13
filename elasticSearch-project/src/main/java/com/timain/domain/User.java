package com.timain.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@Document(indexName = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 5586122645026172133L;

    @Field(type = FieldType.Text)
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Integer)
    private Integer age;

    @Field(type = FieldType.Keyword)
    private String sex;

    @Field(type = FieldType.Text)
    private String address;
}
