package com.wilmar.web.repository.menu;

import com.wilmar.web.entity.menu.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, String> {

}
