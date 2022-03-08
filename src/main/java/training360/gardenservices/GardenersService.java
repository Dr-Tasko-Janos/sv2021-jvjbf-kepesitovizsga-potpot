package training360.gardenservices;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GardenersService {

    private final GardenersRepository gardenersRepository;
    private ModelMapper modelMapper;

    public GardenersService(GardenersRepository gardenersRepository) {
        this.gardenersRepository = gardenersRepository;
    }

    public java.lang.reflect.Type targetListType = new TypeToken<List<GardenerDto>>(){}.getType();
    public List<GardenerDto> getGardeners() {
            return null;
    }

    public GardenerDto addGardener(CreateGardenerCommand command) {

        Gardener newGardener = new Gardener(command.getName());
        gardenersRepository.addGardener(newGardener.getName());
        return modelMapper.map(newGardener, GardenerDto.class);
    }
}
