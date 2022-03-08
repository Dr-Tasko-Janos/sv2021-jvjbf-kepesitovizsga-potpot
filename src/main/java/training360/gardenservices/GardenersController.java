package training360.gardenservices;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GardenersController {

    private final GardenersService gardenersService;

    public GardenersController(GardenersService gardenersService) {
        this.gardenersService = gardenersService;
    }

    @GetMapping("/gardeners")
    public List<GardenerDto> getGardeners() {
        return gardenersService.getGardeners();
    }

    @PostMapping("/gardeners")
    public GardenerDto addGardener(@RequestBody CreateGardenerCommand command) {
        return gardenersService.addGardener(command);
    }
}
