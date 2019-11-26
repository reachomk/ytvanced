package defpackage;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: balj */
public final class balj extends AbstractList {
    private civ a;
    private cil[] b;
    private ckg c = null;
    private ckq d = null;
    private SoftReference[] e;
    private List f;
    private Map g = new HashMap();
    private int[] h;
    private int i = -1;

    public balj(long j, civ civ, cil... cilArr) {
        this.a = civ;
        this.b = cilArr;
        for (ckg ckg : bani.a(civ, "moov[0]/trak")) {
            if (ckg.a().a == j) {
                this.c = ckg;
            }
        }
        if (this.c != null) {
            for (ckq ckq : bani.a(civ, "moov[0]/mvex[0]/trex")) {
                if (ckq.a == this.c.a().a) {
                    this.d = ckq;
                }
            }
            this.e = (SoftReference[]) Array.newInstance(SoftReference.class, size());
            if (this.f == null) {
                int i;
                ArrayList arrayList = new ArrayList();
                for (cko a : this.a.a(cko.class)) {
                    for (ckp ckp : a.a(ckp.class)) {
                        if (ckp.a().a == this.c.a().a) {
                            arrayList.add(ckp);
                        }
                    }
                }
                cil[] cilArr2 = this.b;
                if (cilArr2 != null) {
                    for (bako a2 : cilArr2) {
                        for (cko a3 : a2.a(cko.class)) {
                            for (ckp ckp2 : a3.a(ckp.class)) {
                                if (ckp2.a().a == this.c.a().a) {
                                    arrayList.add(ckp2);
                                }
                            }
                        }
                    }
                }
                this.f = arrayList;
                this.h = new int[this.f.size()];
                int i2 = 1;
                for (int i3 = 0; i3 < this.f.size(); i3++) {
                    this.h[i3] = i2;
                    List b = ((ckp) this.f.get(i3)).b();
                    int i4 = 0;
                    for (i = 0; i < b.size(); i++) {
                        cis cis = (cis) b.get(i);
                        if (cis instanceof ckr) {
                            i4 += bana.a(((ckr) cis).a());
                        }
                    }
                    i2 += i4;
                }
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("This MP4 does not contain track ");
        stringBuilder.append(j);
        throw new RuntimeException(stringBuilder.toString());
    }

    public final int size() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (cko a : this.a.a(cko.class)) {
            for (ckp ckp : a.a(ckp.class)) {
                if (ckp.a().a == this.c.a().a) {
                    i2 = (int) (((long) i2) + ((ckr) ckp.a(ckr.class).get(0)).a());
                }
            }
        }
        int i3 = i2;
        for (bako a2 : this.b) {
            for (cko a3 : a2.a(cko.class)) {
                for (ckp ckp2 : a3.a(ckp.class)) {
                    if (ckp2.a().a == this.c.a().a) {
                        i3 = (int) (((long) i3) + ((ckr) ckp2.a(ckr.class).get(0)).a());
                    }
                }
            }
        }
        this.i = i3;
        return i3;
    }

    public final /* synthetic */ Object get(int i) {
        SoftReference softReference = this.e[i];
        if (softReference != null) {
            bakz bakz = (bakz) softReference.get();
            if (bakz != null) {
                return bakz;
            }
        }
        int i2 = i + 1;
        int length = this.h.length;
        do {
            length--;
        } while (i2 - this.h[length] < 0);
        ckp ckp = (ckp) this.f.get(length);
        i2 -= this.h[length];
        civ civ = (cko) ckp.e;
        int i3 = 0;
        for (cis cis : ckp.b()) {
            if (cis instanceof ckr) {
                ckr ckr = (ckr) cis;
                int i4 = i2 - i3;
                if (ckr.c.size() >= i4) {
                    long j;
                    List<cku> list = ckr.c;
                    cks a = ckp.a();
                    boolean h = ckr.h();
                    i3 = a.n() & 16;
                    long j2 = 0;
                    if (h) {
                        j = 0;
                    } else if (i3 != 0) {
                        j = a.d;
                    } else {
                        ckq ckq = this.d;
                        if (ckq != null) {
                            j = ckq.c;
                        } else {
                            throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                        }
                    }
                    SoftReference softReference2 = (SoftReference) this.g.get(ckr);
                    ByteBuffer byteBuffer = softReference2 != null ? (ByteBuffer) softReference2.get() : null;
                    if (byteBuffer == null) {
                        if ((a.n() & 1) != 0) {
                            j2 = a.b;
                            civ = civ.e;
                        }
                        if (ckr.g()) {
                            j2 += (long) ckr.a;
                        }
                        i3 = 0;
                        for (cku cku : list) {
                            i3 = h ? (int) (((long) i3) + cku.b) : (int) (((long) i3) + j);
                        }
                        try {
                            byteBuffer = civ.a(j2, (long) i3);
                            this.g.put(ckr, new SoftReference(byteBuffer));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    int i5 = 0;
                    for (length = 0; length < i4; length++) {
                        i5 = (int) (h ? ((long) i5) + ((cku) list.get(length)).b : ((long) i5) + j);
                    }
                    if (h) {
                        j = ((cku) list.get(i4)).b;
                    }
                    Object bali = new bali(j, byteBuffer, i5);
                    this.e[i] = new SoftReference(bali);
                    return bali;
                }
                i3 += ckr.c.size();
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }
}
