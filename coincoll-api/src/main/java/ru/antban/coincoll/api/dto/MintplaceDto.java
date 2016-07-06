package ru.antban.coincoll.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.antban.coincoll.model.Mintplace;

public class MintplaceDto extends MintplaceToCreate {
    @JsonProperty(value = "id", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static MintplaceDto of(Mintplace mintplace) {
        if (null == mintplace) {
            return null;
        }
        final MintplaceDto result = new MintplaceDto();
        result.setId(mintplace.getId());
        result.setCode(mintplace.getCode());
        result.setName(mintplace.getName());
        return result;
    }
}
