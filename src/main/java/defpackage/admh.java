package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: admh */
public final class admh {
    public List a;
    private final SharedPreferences b;
    private volatile boolean c = false;

    public admh(SharedPreferences sharedPreferences) {
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences, (Object) "preferences can not be null");
    }

    public final List a() {
        if (this.c) {
            return this.a;
        }
        String str = "screenIds";
        if (this.b.contains(str)) {
            String str2 = "";
            String string = this.b.getString(str, str2);
            str = ",";
            String[] split = string.split(str);
            String[] split2 = this.b.getString("screenNames", str2).split(str);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < split.length) {
                CharSequence charSequence = split[i];
                if (!TextUtils.isEmpty(charSequence)) {
                    adin a = adio.h().a(adix.MANUAL).a(new adjb(charSequence)).a(i < split2.length ? split2[i] : str2);
                    a.a = null;
                    arrayList.add(a.b());
                }
                i++;
            }
            this.a = arrayList;
        } else {
            this.a = new ArrayList();
        }
        this.c = true;
        return this.a;
    }

    public final adio a(adjb adjb) {
        b();
        adio a = adlw.a(this.a, adjb);
        if (a != null) {
            this.a.remove(a);
        }
        a(this.a);
        return a;
    }

    public final void a(List list) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (adio adio : list) {
            stringBuilder.append(adio.br_());
            String str = ",";
            stringBuilder.append(str);
            stringBuilder2.append(adio.bq_());
            stringBuilder2.append(str);
        }
        this.b.edit().putString("screenIds", stringBuilder.toString()).putString("screenNames", stringBuilder2.toString()).commit();
    }

    public final void b() {
        if (!this.c) {
            synchronized (this) {
                a();
            }
        }
    }
}
