public class WallpaperService {
    private int calculatePerimeter(int length, int width) {
        int perimeter = (length + width) * 2;
        return perimeter;
    }

    private int calculateLengthWallpaperCloth(int heightRoom, int rapport, int displacement) {
        int stock = 10;
        int result = heightRoom + rapport + displacement + stock;
        return result;
    }

    private int calculateCloth(int perimeter, int widthWallpaper) {
        int clothes = (int) Math.ceil(perimeter * 100 / (double) widthWallpaper);
        return clothes;
    }

    private int calculateClothInOneRoll(int lengthWallpaperCloth) {
        int lengthRoll = 1000;
        int clothesInOneRoll = lengthRoll / lengthWallpaperCloth;
        return clothesInOneRoll;
    }

    private int calculateRoll(int clothes, int clothesInOneRoll) {
        int countRoll = (int) Math.ceil(clothes / (double) clothesInOneRoll);
        return countRoll;
    }

    public int calculateCountOfRoll(int lengthRoom, int widthRoom, int heightRoom, int wightWallpaper, int rapport, int displacement) {
        int perimeter = calculatePerimeter(lengthRoom, widthRoom);
        int lengthWallpaperCloth = calculateLengthWallpaperCloth(heightRoom, rapport, displacement);
        int clothes = calculateCloth(perimeter, wightWallpaper);
        int clothesInOneRoll = calculateClothInOneRoll(lengthWallpaperCloth);
        int rollCount = calculateRoll(clothes, clothesInOneRoll);
        return rollCount;
    }
}
