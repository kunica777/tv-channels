package Components;

import org.springframework.stereotype.Component;

@Component
public class TNT implements Channel{
    private String name = "TNT";
    private String language = "russian";

    @Override
    public String loadChannel() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }
}
