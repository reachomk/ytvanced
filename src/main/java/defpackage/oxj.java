package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.File;
import java.util.HashMap;

/* renamed from: oxj */
final class oxj {
    public final HashMap a = new HashMap();
    public final SparseArray b = new SparseArray();
    public final oxl c;
    private final SparseBooleanArray d = new SparseBooleanArray();
    private final SparseBooleanArray e = new SparseBooleanArray();

    public oxj(File file, byte[] bArr, boolean z) {
        oxz.b(true);
        this.c = new oxm(new File(file, "cached_content_index.exi"), bArr, z);
    }

    public final void a() {
        this.c.a(this.a);
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.d.keyAt(i));
        }
        this.d.clear();
        this.e.clear();
    }

    public final oxk a(String str) {
        oxk oxk = (oxk) this.a.get(str);
        if (oxk != null) {
            return oxk;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int keyAt = size != 0 ? sparseArray.keyAt(size - 1) + 1 : 0;
        if (keyAt < 0) {
            keyAt = 0;
            while (keyAt < size && keyAt == sparseArray.keyAt(keyAt)) {
                keyAt++;
            }
        }
        oxk = new oxk(keyAt, str);
        this.a.put(str, oxk);
        this.b.put(keyAt, str);
        this.e.put(keyAt, true);
        this.c.b();
        return oxk;
    }

    public final oxk b(String str) {
        return (oxk) this.a.get(str);
    }

    public final void c(String str) {
        oxk oxk = (oxk) this.a.get(str);
        if (oxk != null && oxk.a() && !oxk.e) {
            this.a.remove(str);
            int i = oxk.a;
            boolean z = this.e.get(i);
            this.c.c();
            if (z) {
                this.b.remove(i);
                this.e.delete(i);
                return;
            }
            this.b.put(i, null);
            this.d.put(i, true);
        }
    }
}
