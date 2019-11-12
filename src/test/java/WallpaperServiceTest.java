import static org.junit.jupiter.api.Assertions.*;

class WallpaperServiceTest {

    @org.junit.jupiter.api.Test
    void calculateCountOfRollWithRapport() {
        WallpaperService wallpaperService = new WallpaperService();
        int result = wallpaperService.calculateCountOfRoll(1, 2, 200, 53, 64, 0);
        assertEquals(4, result);
    }

    @org.junit.jupiter.api.Test
    void calculateCountOfRollWithRapportAndDisplacement() {
        WallpaperService wallpaperService = new WallpaperService();
        int result = wallpaperService.calculateCountOfRoll(1, 2, 200, 53, 64, 32);
        assertEquals(4, result);
    }

    @org.junit.jupiter.api.Test
    void calculateCountOfRollWithoutRapportAndDisplacement() {
        WallpaperService wallpaperService = new WallpaperService();
        int result = wallpaperService.calculateCountOfRoll(3, 4, 200, 53, 0, 0);
        assertEquals(7, result);
    }
}