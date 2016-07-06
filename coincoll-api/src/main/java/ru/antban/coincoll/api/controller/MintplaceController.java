package ru.antban.coincoll.api.controller;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.antban.coincoll.api.dto.MintplaceListDto;
import ru.antban.coincoll.api.dto.MintplaceToCreate;
import ru.antban.coincoll.model.Mintplace;

@RestController
public class MintplaceController {
    private final List<Mintplace> mintplaces = new ArrayList<>();

    @RequestMapping(value = "/api/mintplaces", method = RequestMethod.GET, produces = "application/json")
    public MintplaceListDto listMintplaces(
            @RequestParam(name = "offset", defaultValue = "0") Integer offset,
            @RequestParam(name = "offset", defaultValue = "20") Integer count,
            @RequestParam(name = "sort_by", defaultValue = "name") String sortBy) {
        return MintplaceListDto.of(mintplaces);
    }

    @RequestMapping(value = "/api/mintplaces", method = RequestMethod.POST, consumes = "application/json")
    public void createMintplace(
            @RequestBody MintplaceToCreate value) {
        final Mintplace mp = new Mintplace();
        mp.setId(new Random(System.currentTimeMillis()).nextInt());
        mp.setCode(value.getCode());
        mp.setName(value.getName());
        mintplaces.add(mp);
    }
}
