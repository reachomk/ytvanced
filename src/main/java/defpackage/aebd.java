package defpackage;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: aebd */
public final class aebd {
    private static final String e = xtl.b("MDX.UserProfile");
    public final int[] a = new int[28];
    public final int[] b = new int[28];
    public final aebc c;
    public final bdfg d = bdfg.h();
    private final xsc f;
    private final SharedPreferences g;

    public aebd(aebc aebc, xsc xsc, SharedPreferences sharedPreferences) {
        Arrays.fill(this.a, 0);
        Arrays.fill(this.b, 0);
        this.c = aebc;
        aebc = this.c;
        String str = "mdx-profile-creation-timestamp";
        if (!aebc.b.contains(str)) {
            aebc.b.edit().putLong(str, aebc.c.a()).apply();
        }
        str = "user-stats-timestamp";
        if (aebc.b.contains(str)) {
            aebc.f = aebc.b.getLong(str, 0);
            str = "mdx-connection-count";
            String str2 = "";
            if (aebc.b.contains(str)) {
                aebc.a(aebc.b.getString(str, str2), aebc.d);
            } else {
                xtl.a(aebc.a, "No connection count stats in the preferences");
            }
            str = "cast-available-session-count";
            if (aebc.b.contains(str)) {
                aebc.a(aebc.b.getString(str, str2), aebc.e);
            } else {
                xtl.a(aebc.a, "No cast available session count stats in the preferences");
            }
            if (aebc.a()) {
                aebc.a(aebc.d, aebc.e, 0);
            }
        }
        aebc = this.c;
        System.arraycopy(aebc.d, 0, this.a, 0, 28);
        aebc = this.c;
        System.arraycopy(aebc.e, 0, this.b, 0, 28);
        this.f = xsc;
        this.g = sharedPreferences;
        b();
    }

    public final void a() {
        this.c.a();
        int[] iArr = this.b;
        if (iArr[0] == 0) {
            iArr[0] = 1;
        }
        this.c.a(this.a, iArr, 1);
        b();
    }

    public final void b() {
        this.d.e_(this);
    }

    public final void a(adit adit) {
        int i = 0;
        adit = adit.a(aebd.a(this.a, 0)).b(aebd.a(this.a, 1)).c(aebd.a(this.a, 2)).d(aebd.a(this.b, 0)).e(aebd.a(this.b, 1)).f(aebd.a(this.b, 2));
        String string = this.g.getString("MdxCasterCategoryOverride", "");
        Integer num = null;
        if (!amqu.a(string)) {
            try {
                int parseInt = Integer.parseInt(string);
                if (parseInt != -1) {
                    if (parseInt == 0 || parseInt == 1 || parseInt == 2 || parseInt == 3 || parseInt == 4) {
                        num = Integer.valueOf(parseInt);
                    }
                }
            } catch (NumberFormatException e) {
                xtl.b(e, "Invalid caster category override value", e);
            }
        }
        if (num == null) {
            long j = 0;
            long j2 = this.c.b.getLong("mdx-last-connection-timestamp", 0);
            if (j2 != 0) {
                long toDays = TimeUnit.MILLISECONDS.toDays(this.f.a() - j2);
                i = toDays > 7 ? toDays > 28 ? 2 : 3 : 4;
            } else {
                aebc aebc = this.c;
                j2 = aebc.b.getLong("mdx-profile-creation-timestamp", -1);
                if (j2 != -1) {
                    j = TimeUnit.MILLISECONDS.toDays(aebc.c.a() - j2);
                }
                if (j > 28) {
                    i = 1;
                }
            }
        } else {
            i = num.intValue();
        }
        adit.i(i);
    }

    private static int a(int[] iArr, int i) {
        int i2 = 1;
        if (i != 0) {
            i2 = i != 1 ? 28 : 7;
        }
        int i3 = 0;
        for (i = 0; i < i2; i++) {
            i3 += iArr[i];
        }
        return i3;
    }
}
