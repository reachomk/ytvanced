package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* renamed from: ugc */
public final class ugc extends qy {
    private List k;
    private List l;

    public ugc(Context context) {
        super(context.getApplicationContext());
    }

    public ugc(Context context, List list) {
        this(context);
        this.l = list;
    }

    private final void a(List list) {
        this.k = list;
        rg rgVar = this.d;
        if (rgVar != null) {
            rgVar.c(list);
        }
    }

    public final void e() {
        List list = this.k;
        if (list != null) {
            a(list);
        } else {
            a();
        }
    }

    public final void f() {
        b();
    }

    public final /* synthetic */ Object d() {
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(ugi.a(ugi.a(this.e.getApplicationContext(), "third_party_license_metadata", 0, -1), ""));
        List<String> list = this.l;
        if (list != null) {
            for (String str : list) {
                Collection a;
                String a2 = ugi.a("res/raw/third_party_license_metadata", str, 0, -1);
                if (a2 != null) {
                    a = ugi.a(a2, str);
                } else {
                    a = new ArrayList();
                }
                treeSet.addAll(a);
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    static {
        ugc.class.getCanonicalName();
    }
}
