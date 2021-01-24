package SoloLearn.Enum;

public enum WhoisRIR {
    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net");

    private String url;

    WhoisRIR(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
