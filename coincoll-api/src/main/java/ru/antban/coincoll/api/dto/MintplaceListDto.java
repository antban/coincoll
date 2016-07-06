package ru.antban.coincoll.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.stream.Collectors;
import ru.antban.coincoll.model.Mintplace;

public class MintplaceListDto {
    @JsonProperty(value = "items", required = true)
    private List<MintplaceDto> items;

    public List<MintplaceDto> getItems() {
        return items;
    }

    public void setItems(List<MintplaceDto> items) {
        this.items = items;
    }


    public static MintplaceListDto of(List<Mintplace> mintplaces) {
        final MintplaceListDto result = new MintplaceListDto();
        result.setItems(mintplaces.stream().map(MintplaceDto::of).collect(Collectors.toList()));
        return result;
    }
}
