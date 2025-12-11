package com.wilmar.web.entity.base;

import com.wilmar.web.enums.ActiveEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    // Enum sẽ lưu dưới dạng String trong Mongo (không cần @Enumerated)
    protected ActiveEnum active = ActiveEnum.ACTIVATED; // default

    @CreatedBy
    protected String createdBy;

    @CreatedDate
    protected Instant createdTime;

    @LastModifiedBy
    protected String updatedBy;

    @LastModifiedDate
    protected Instant updatedTime;

    // Dùng @Version của Spring Data để optimistic locking trong Mongo
    @Version
    protected Long version; // lần đầu sẽ null; Mongo/SD sẽ quản lý tăng version
}
// JPA lifecycle callback -> bỏ trong Mongo
// Nếu vẫn muốn set mặc định, có thể giữ default value như trên,
// hoặc dùng Mongo event listener (xem dưới).

