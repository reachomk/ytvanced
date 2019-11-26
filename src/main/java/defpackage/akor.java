package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akor */
public final class akor extends acwb {
    public final aac d;
    private Map e;

    public akor() {
        this.d = new aac();
    }

    public akor(akor akor) {
        this();
        a(akor);
    }

    public final void a() {
        this.a = acvx.g;
        this.d.clear();
        Map map = this.e;
        if (map != null) {
            map.clear();
        }
    }

    public final void a(akor akor) {
        amqw.a((Object) akor);
        a();
        this.a = akor.a;
        this.b = akor.b;
        this.c = akor.c;
        a(akor.e);
        this.d.a(akor.d);
    }

    public final void a(Map map) {
        if (map != null && map.size() > 0) {
            if (this.e == null) {
                this.e = new HashMap();
            }
            this.e.putAll(map);
        }
    }

    public final void a(String str, Object obj) {
        this.d.put(str, obj);
    }

    public final Map b() {
        Map map = this.e;
        return map == null ? Collections.emptyMap() : map;
    }

    public final Object a(String str) {
        return this.d.get(str);
    }

    public final Object b(String str, Object obj) {
        Object obj2 = this.d.get(str);
        return obj2 == null ? obj : obj2;
    }

    public final boolean a(String str, boolean z) {
        Object obj = this.d.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public final int a(String str, int i) {
        Object obj = this.d.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    public final String b(String str) {
        Object obj = this.d.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
