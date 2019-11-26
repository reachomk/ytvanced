package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: afhs */
public final class afhs {
    public static final Pattern a = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern b = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern c = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public static int a(File file) {
        File file2 = file;
        if (new File(file2, "cached_content_index.exi").exists()) {
            return 0;
        }
        if (!file.exists()) {
            return file.getParentFile().getFreeSpace() >= 65536 ? 1 : 3;
        } else {
            File[] a = afhs.a(file2.listFiles(new afhv()));
            Map hashMap = new HashMap();
            for (File file3 : a) {
                String a2 = afhs.a(afhs.b(file3.getName()));
                if (a2 != null) {
                    hashMap.put(a2, Long.valueOf(hashMap.containsKey(a2) ? ((Long) hashMap.get(a2)).longValue() + file3.length() : file3.length()));
                }
            }
            long max = Math.max(65536, (((long) (hashMap.size() * 48)) + 32) << 2);
            long freeSpace = file.getFreeSpace();
            if (freeSpace >= max) {
                return 1;
            }
            int i;
            max -= freeSpace;
            File[] a3 = afhs.a(file2.listFiles(new afhu()));
            long j = max;
            for (i = 0; i < a3.length && j > 0; i++) {
                freeSpace = a3[i].length();
                if (!a3[i].delete()) {
                    freeSpace = 0;
                }
                j -= freeSpace;
            }
            for (String a4 = afhs.a(hashMap); a4 != null && j > 0; a4 = afhs.a(hashMap)) {
                long j2 = 0;
                for (File file4 : a) {
                    if (a4.equals(afhs.a(afhs.b(file4.getName())))) {
                        long length = file4.length();
                        if (!file4.delete()) {
                            length = 0;
                        }
                        j2 += length;
                    }
                }
                j -= j2;
                hashMap.remove(a4);
            }
            if (j <= 0) {
                return 2;
            }
            return 3;
        }
    }

    private static File[] a(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private static String a(Map map) {
        String str = null;
        long j = Long.MAX_VALUE;
        for (Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() < j) {
                str = (String) entry.getKey();
                j = ((Long) entry.getValue()).longValue();
            }
        }
        return str;
    }

    private static String a(String str) {
        return str != null ? str.split("\\.")[0] : null;
    }

    private static String b(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        Matcher matcher2 = b.matcher(str);
        return matcher2.matches() ? ozp.i(matcher2.group(1)) : null;
    }
}
