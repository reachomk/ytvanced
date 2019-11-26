package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.File;
import java.util.HashMap;

/* renamed from: nxo */
final class nxo {
    public final HashMap a = new HashMap();
    public final SparseArray b = new SparseArray();
    public final nxq c;
    private final SparseBooleanArray d = new SparseBooleanArray();
    private final SparseBooleanArray e = new SparseBooleanArray();

    public nxo(File file, byte[] bArr, boolean z) {
        oxz.b(true);
        this.c = new nxn(new File(file, "cached_content_index.exi"), bArr, z);
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

    public final nxl a(String str) {
        nxl nxl = (nxl) this.a.get(str);
        if (nxl != null) {
            return nxl;
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
        nxl = new nxl(keyAt, str);
        this.a.put(str, nxl);
        this.b.put(keyAt, str);
        this.e.put(keyAt, true);
        this.c.b();
        return nxl;
    }

    public final nxl b(String str) {
        return (nxl) this.a.get(str);
    }

    public final void c(String str) {
        nxl nxl = (nxl) this.a.get(str);
        if (nxl != null && nxl.a() && !nxl.e) {
            this.a.remove(str);
            int i = nxl.a;
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
