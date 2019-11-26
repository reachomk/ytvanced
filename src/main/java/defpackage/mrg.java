package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: mrg */
final class mrg implements utv, uud {
    private final SharedPreferences a;
    private ust c;
    private uue d;
    private boolean e = false;

    mrg(SharedPreferences sharedPreferences, mni mni) {
        this.a = new mrf((SharedPreferences) amqw.a((Object) sharedPreferences), mni.a);
    }

    public final void b(String str) {
    }

    public final void f() {
    }

    public final boolean g() {
        return false;
    }

    private final synchronized void i() {
        if (!this.e) {
            String str = null;
            String string = this.a.getString(utl.ACCOUNT_NAME, null);
            String string2 = this.a.getString(utl.EXTERNAL_ID, null);
            if (string != null) {
                if (string2 != null) {
                    String string3 = this.a.getString(utl.PAGE_ID, null);
                    if (!"No +Page Delegate".equals(string3)) {
                        str = string3;
                    }
                    this.c = ust.b(string2, string, str);
                    this.e = true;
                }
            }
            this.c = null;
            this.e = true;
        }
    }

    public final synchronized boolean a() {
        if (!this.e) {
            i();
        }
        return this.c != null;
    }

    public final synchronized boolean b() {
        return this.a.getBoolean(utl.USER_SIGNED_OUT, false);
    }

    public final synchronized afpt c() {
        if (!this.e) {
            i();
        }
        ust ust = this.c;
        if (ust != null) {
            return ust;
        }
        return afpt.g;
    }

    public final synchronized afpt a(String str) {
        if (afpt.g.a().equals(str)) {
            return afpt.g;
        }
        ust ust = this.c;
        if (ust == null || !ust.a().equals(str)) {
            return null;
        }
        return this.c;
    }

    public final synchronized uue d() {
        return this.d;
    }

    public final synchronized void a(ust ust) {
        this.a.edit().putString(utl.ACCOUNT_NAME, ust.b()).putString(utl.PAGE_ID, ust.c()).putString(utl.EXTERNAL_ID, ust.a()).putBoolean(utl.USER_SIGNED_OUT, false).apply();
        this.e = false;
    }

    public final synchronized void a(uue uue) {
        this.d = uue;
    }

    public final synchronized void e() {
        this.d = uue.a;
    }

    public final synchronized void a(boolean z) {
        this.a.edit().remove(utl.ACCOUNT_NAME).remove(utl.PAGE_ID).remove(utl.EXTERNAL_ID).remove(utl.USERNAME).putBoolean(utl.USER_SIGNED_OUT, z).apply();
        this.e = false;
    }

    public final String h() {
        return this.a.getString("visitor_id", null);
    }

    public final List a(Account[] accountArr) {
        ust ust = this.c;
        if (ust != null) {
            String b = ust.b();
            int length = accountArr.length;
            int i = 0;
            while (i < length) {
                if (!b.equals(accountArr[i].name)) {
                    i++;
                }
            }
            a(false);
            return Collections.singletonList(this.c);
        }
        return Collections.emptyList();
    }

    public final void a(String str, String str2) {
        if (a() && str.equals(this.c.b())) {
            a(ust.b(this.c.a(), str2, this.c.c()));
        }
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(str2);
        stringBuilder.append("_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
