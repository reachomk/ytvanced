package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Deprecated
/* renamed from: acxv */
public class acxv {
    public final String a = acxv.a((Object) this);
    public final Set b = new HashSet();
    public acxy c;
    public dil d;
    public boolean e;
    private final String f;
    private final int g;
    private final boolean h;
    private final Map i = new HashMap();
    private final din j;
    private String k;
    private Set l;
    private Set m;

    protected acxv(String str, int i, boolean z) {
        Object obj = (String) amqw.a((Object) str);
        Object dia = new dia();
        this.f = (String) amqw.a(obj);
        this.j = (din) amqw.a(dia);
        this.h = z;
        this.g = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str) {
        this.c.b = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, String str2) {
        if (b()) {
            this.c.a(str, str2);
        } else {
            xtl.d("CsiAction not yet started.");
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(xbb xbb, Set set, Set set2) {
        if (b()) {
            String str = this.a;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 38);
            stringBuilder.append("CsiAction [");
            stringBuilder.append(str);
            stringBuilder.append("] already started. Ignored.");
            xtl.d(stringBuilder.toString());
            return;
        }
        String.format("CsiAction START [%s] due to: %s", new Object[]{this.a, acxv.a((Object) xbb)});
        this.l = (Set) amqw.a((Object) set);
        this.m = (Set) amqw.a((Object) set2);
        this.c = new acxy(this.f, this.j);
        this.d = dik.a(xbb.a());
        this.k = xbb.g;
        a("yt_lt", "warm");
    }

    /* Access modifiers changed, original: protected */
    public boolean a(xbb xbb) {
        if (b()) {
            boolean z = xbb instanceof xbe;
            Object obj = xbb.g;
            Class cls = xbb.getClass();
            if (z || !this.b.contains(obj)) {
                if (TextUtils.isEmpty(obj)) {
                    xtl.d(String.format("CsiAction [%s] triggered with no registered label", new Object[]{this.a}));
                } else {
                    if (z) {
                        if (this.i.containsKey(obj)) {
                            int intValue = ((Integer) this.i.get(obj)).intValue();
                            this.i.put(obj, Integer.valueOf(intValue + 1));
                            String valueOf = String.valueOf(obj);
                            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 12);
                            stringBuilder.append(valueOf);
                            stringBuilder.append("_");
                            stringBuilder.append(intValue);
                            obj = stringBuilder.toString();
                        } else {
                            this.i.put(obj, Integer.valueOf(1));
                        }
                    }
                    if (this.c.a(this.d, xbb.a(), obj)) {
                        this.b.add(obj);
                    } else {
                        xtl.d(String.format("CsiAction [%s] past event %s can't be marked", new Object[]{this.a, obj}));
                    }
                }
            } else if (!TextUtils.equals(this.k, obj)) {
                xtl.d(String.format("CsiAction [%s] already ticked %s. Ignored.", new Object[]{this.a, obj}));
            }
            z = this.e;
            int i = (!this.m.contains(cls) || this.b.size() <= 1) ? 0 : 1;
            this.e = z | i;
            z = this.l.contains(cls) && this.b.size() > 1;
            if (this.m.contains(cls)) {
                String.format("CsiAction DROP [%s](%b) due to: %s", new Object[]{this.a, Boolean.valueOf(this.e), acxv.a((Object) xbb)});
            }
            if (this.l.contains(cls)) {
                String.format("CsiAction END [%s](%b) due to: %s", new Object[]{this.a, Boolean.valueOf(z), acxv.a((Object) xbb)});
            }
            if (z || this.e) {
                return true;
            }
            return false;
        }
        String str = this.a;
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 29);
        stringBuilder2.append("CsiAction [");
        stringBuilder2.append(str);
        stringBuilder2.append("] not yet started.");
        xtl.d(stringBuilder2.toString());
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return (this.c == null || this.d == null) ? false : true;
    }

    public final void c() {
        String.format("CsiAction DROP [%s]", new Object[]{this.a});
        this.e = true;
    }

    public dik a() {
        if (b()) {
            a("mod_li", !this.h ? "0" : "1");
            a("conn", String.valueOf(this.g));
            return this.c;
        }
        xtl.d("CsiAction.start() should be called before report. Ignored.");
        return null;
    }

    public static String a(Object obj) {
        String name = obj.getClass().getName();
        int indexOf = name.indexOf(36);
        if (indexOf >= 0) {
            indexOf++;
            if (indexOf < name.length()) {
                return name.substring(indexOf);
            }
        }
        return obj.getClass().getSimpleName();
    }
}
