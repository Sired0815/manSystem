package cn.utils;


import java.util.Arrays;
import java.util.List;

public final class DistingPicture {
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 5; // 5MB

	public static boolean isPicture(String name) {
		List<String> list = Arrays.asList("jpg", "jpeg", "png", "bmp", "gif");
		String suffix = name.substring(name.lastIndexOf(".") + 1);
		return list.contains(suffix);
	}

	// 判断文件是否超长：默认<=5MB
	public static boolean isSuitSize(Long size) {
		return size <= MAX_FILE_SIZE;
	}
}
