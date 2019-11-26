package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aebc */
public final class aebc {
    public static final String a = xtl.b("MDX.user");
    private static final long g = TimeUnit.DAYS.toMillis(1);
    public final SharedPreferences b;
    public final xsc c;
    public final int[] d = new int[28];
    public final int[] e = new int[28];
    public long f;

    public aebc(SharedPreferences sharedPreferences, xsc xsc) {
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.c = xsc;
        Arrays.fill(this.d, 0);
        Arrays.fill(this.e, 0);
        this.f = 0;
    }

    public final void a(int[] iArr, int[] iArr2, int i) {
        if (i == 2) {
            this.b.edit().putLong("mdx-last-connection-timestamp", this.c.a()).apply();
        }
        if (this.f == 0) {
            xtl.a(a, "No user stats to save.");
            return;
        }
        System.arraycopy(iArr, 0, this.d, 0, 28);
        System.arraycopy(iArr2, 0, this.e, 0, 28);
        Editor edit = this.b.edit();
        edit.putLong("user-stats-timestamp", this.f);
        edit.putString("mdx-connection-count", aebc.a(this.d));
        edit.putString("cast-available-session-count", aebc.a(this.e));
        edit.apply();
    }

    public static void a(String str, int[] iArr) {
        String[] split = str.split(",");
        int i = 0;
        if (split.length != iArr.length) {
            String.format(Locale.US, "Expected %d values in the storage but found %d values", new Object[]{Integer.valueOf(r1), Integer.valueOf(r0)});
        }
        while (i < Math.min(split.length, iArr.length)) {
            if (!TextUtils.isEmpty(split[i])) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            i++;
        }
    }

    private static String a(int[] iArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return stringBuilder.toString();
            }
            stringBuilder.append(iArr[i]);
            if (i < length - 1) {
                stringBuilder.append(",");
            }
            i++;
        }
    }

    public final boolean a() {
        long a = this.c.a();
        long j = this.f;
        long j2 = a - j;
        long j3 = g;
        if (j2 < j3) {
            return false;
        }
        int i = (int) ((a - j) / j3);
        this.f = j + (((long) i) * j3);
        int min = Math.min(i, 28);
        for (i = 27; i >= min; i--) {
            int[] iArr = this.d;
            int i2 = i - min;
            iArr[i] = iArr[i2];
            iArr = this.e;
            iArr[i] = iArr[i2];
        }
        Arrays.fill(this.d, 0, min, 0);
        Arrays.fill(this.e, 0, min, 0);
        return true;
    }
}
