package Card.Display.Card.Display.CRUD.service;

import Card.Display.Card.Display.CRUD.models.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileService {
    private final List<Profile> profiles = new ArrayList<>();

    public void addProfile(Profile profile) {
        // Normalize gender to TitleCase
        String gender = profile.getGender().toLowerCase();
        if (gender.equals("male")) {
            profile.setGender("Male");
        } else if (gender.equals("female")) {
            profile.setGender("Female");
        }
        profiles.add(profile);
    }

    public List<Profile> getAllProfiles() {
        return profiles;
    }

    public List<Profile> filterProfilesByGender(String gender) {
        return profiles.stream()
                .filter(p -> p.getGender().equalsIgnoreCase(gender))
                .collect(Collectors.toList());
    }
}
