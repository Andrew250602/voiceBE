package com.wilmar.web.entity.authentication;


import com.wilmar.web.entity.base.BaseEntity;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "table_base_users") // tương đương @Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Authentication extends BaseEntity {

    @Id
    private ObjectId id;
    private String username;

}