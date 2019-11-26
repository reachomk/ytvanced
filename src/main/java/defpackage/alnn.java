package defpackage;

import android.text.TextUtils;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.List;

/* renamed from: alnn */
public final class alnn extends aknb {
    public final List a;
    public final alno b;
    public Object d;
    public List e;
    public alnm f;

    public alnn(List list, alno alno) {
        this.a = (List) amqw.a((Object) list);
        this.b = (alno) amqw.a((Object) alno);
    }

    public final long a(int i) {
        return (long) i;
    }

    public final boolean isEmpty() {
        boolean z = true;
        if (!this.a.isEmpty()) {
            List list = this.e;
            if (list != null) {
                return list.isEmpty() ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final int d() {
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        List list = this.e;
        int size;
        if (list != null) {
            size = list.size();
            if (this.d != null) {
                i = 1;
            }
            return size + i;
        }
        size = this.a.size();
        if (this.d != null) {
            i = 1;
        }
        return size + i;
    }

    public final Object c(int i) {
        if (isEmpty()) {
            return null;
        }
        if (i == 0) {
            Object obj = this.d;
            if (obj != null) {
                return obj;
            }
        }
        i -= this.d != null ? 1 : 0;
        List list = this.e;
        if (list != null) {
            i = ((Integer) list.get(i)).intValue();
        }
        return this.a.get(i);
    }

    public static String a(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return Normalizer.normalize(str, Form.NFD).replaceAll("\\p{M}", str2).toUpperCase();
    }
}
