package com.wilmar.web.entity.menu;

import com.wilmar.web.entity.base.BaseEntity;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "table_base_menu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Menu extends BaseEntity {
    @Id
    private ObjectId id;
}
