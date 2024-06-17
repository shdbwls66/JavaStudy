package day13;

public class ProfileService {
    public void saveProfile(ProfileRepository profileRepository){
        if (profileRepository instanceof ProfileDBRepository){
            System.out.println("DB");
        }
        if (profileRepository instanceof ProfileMemoryRepository){
            System.out.println("Memory");
        }

        profileRepository.save();
    }
}
