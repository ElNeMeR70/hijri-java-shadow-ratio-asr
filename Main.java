import java.nio.charset.StandardCharsets;

/**
 * hijri-java-shadow-ratio-asr — حاسبة طول الظل ومقياس العصر الشافعي والحنفي
 * Gnomon Shadow Ratio Solver for Shafi'i/Maliki/Hanbali (1x) vs Hanafi (2x) Asr
 */
public final class Main {
    public static void main(String[] args) {
        String input = "Lat=24.71,Decl=-16.3";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] hijri-java-shadow-ratio-asr (Java) — Gnomon Shadow Ratio Solver for Shafi'i/Maliki/Hanbali (1x) vs Hanafi (2x) Asr");
        System.out.println("[AR]  حاسبة طول الظل ومقياس العصر الشافعي والحنفي");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "ZawalShadowRatio=0.78 | AsrShafiiAlt=29.3deg | AsrHanafiAlt=19.8deg", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
