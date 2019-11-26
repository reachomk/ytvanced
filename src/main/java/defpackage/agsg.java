package defpackage;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: agsg */
public final class agsg implements ovi {
    private final ovi a;
    private final bcaa b;
    private long c;
    private long d;
    private ovm e;
    private String f;
    private int g;
    private String h;
    private long i;
    private int j = -1;
    private boolean k = false;
    private agwh l;
    private agvt m;
    private aghl n;
    private byte[][] o;
    private final ArrayList p = new ArrayList();
    private ahdp q = new ahdp();
    private ahdr r = ahdp.c();
    private final byte[] s = new byte[4096];

    public agsg(ovi ovi, bcaa bcaa) {
        this.a = ovi;
        this.b = bcaa;
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        this.e = ovm;
        this.c = ovm.d;
        agvz b = ((agwc) this.b.get()).b();
        this.l = b.k();
        this.m = b.q();
        this.n = b.p();
        this.f = aeey.a(ovm.g);
        this.g = aajy.a(aeey.b(ovm.g));
        this.j = -1;
        agqy a = this.l.a(this.f);
        if (a == null) {
            return this.a.a(ovm);
        }
        agqz agqz = a.o;
        if (agqz == null) {
            return this.a.a(ovm);
        }
        int y = agxj.y(agqz.f);
        this.j = y;
        if (y == -1) {
            return this.a.a(ovm);
        }
        agql agql;
        agqd agqd = null;
        agqn a2 = this.n.a(this.f, null);
        if (a2 == null) {
            agql = null;
        } else {
            agql agql2 = a2.a;
            if (agql2 == null || agql2.r() != this.g) {
                agql2 = null;
            }
            agql = a2.b;
            if (agql == null || agql.r() != this.g) {
                agql = agql2;
            }
        }
        int i;
        if (agql == null) {
            String str = this.f;
            i = this.g;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
            stringBuilder.append("stream to hash not in store: ");
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(i);
            xtl.c(stringBuilder.toString());
            throw new IOException("stream not in OfflineStreamStore");
        } else if (agql.h() != null) {
            this.j = -1;
            return this.a.a(ovm);
        } else {
            armd armd;
            if ((agql.a().a.a & 1073741824) != 0) {
                armd = agql.a().a.A;
                if (armd == null) {
                    armd = armd.d;
                }
            } else {
                armd = null;
            }
            if (armd != null) {
                int a3 = avpw.a(armd.b);
                if (a3 != 0 && a3 == 3) {
                    long b2;
                    this.i = agql.t();
                    this.h = agql.m();
                    i = this.j;
                    a3 = 1 << i;
                    this.o = new byte[a3][];
                    if (i > 0) {
                        agqd = this.m.a(this.f, this.g, i);
                    }
                    agqd a4 = this.m.a(this.f, this.g, 0);
                    boolean z = agxj.z(agqz.f);
                    this.k = z;
                    if (z) {
                        this.q = new ahdp(true);
                        this.r = ahdp.a(true);
                    }
                    long j = 0;
                    this.d = 0;
                    if (agqd != null) {
                        j = ((long) (agqd.e() + 1)) * ((long) (a3 << 12));
                        this.d = j;
                    }
                    if (a4 != null) {
                        this.d = ((long) a4.e()) << 12;
                        if (a4.g() != null) {
                            try {
                                this.r = (ahdr) new ObjectInputStream(new ByteArrayInputStream(a4.g())).readObject();
                                b2 = this.d + ((long) this.r.b());
                                this.d = b2;
                                j = b2;
                            } catch (ClassNotFoundException e) {
                                throw new IllegalStateException(e);
                            } catch (IOException e2) {
                                throw new IOException("Failed to reconstitute offline content verification state.", e2);
                            }
                        }
                        this.r.a();
                        j = this.d + 4096;
                        this.d = j;
                    }
                    int i2 = (int) (j / 4096);
                    i = this.o.length;
                    i *= i2 / i;
                    for (agqd agqd2 : this.m.a(this.f, this.g, 0, i, i2)) {
                        this.o[agqd2.e() - i] = agqd2.f();
                    }
                    b2 = ovm.d;
                    long j2 = this.d;
                    if (b2 <= j2) {
                        return this.a.a(ovm);
                    }
                    b2 -= j2;
                    if (ovm.e < b2) {
                        xtl.c("Can't hash offline gap");
                        this.d = ovm.d;
                        return this.a.a(ovm);
                    }
                    ovm = ovm.a(-b2);
                    this.c = ovm.d;
                    j2 = this.a.a(ovm);
                    return j2 != -1 ? j2 - b2 : -1;
                }
            }
            this.j = -1;
            return this.a.a(ovm);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        if (this.j == -1) {
            return this.a.a(bArr2, i3, i4);
        }
        long j = this.e.d;
        long j2 = this.c;
        j -= j2;
        long j3 = 0;
        if (j > 0) {
            byte[] bArr3 = new byte[4096];
            while (j > j3) {
                int a = this.a.a(bArr3, 0, (int) Math.min(j, (long) bArr2.length));
                if (a == -1) {
                    return -1;
                }
                long j4 = (long) a;
                this.c += j4;
                b(bArr3, 0, a);
                j -= j4;
                j3 = 0;
            }
        } else {
            j = this.d;
            if (j2 < j) {
                int a2 = this.a.a(bArr2, i3, Math.min(i4, (int) (j - j2)));
                if (a2 == -1) {
                    return -1;
                }
                this.c += (long) a2;
                return a2;
            }
        }
        i4 = this.a.a(bArr2, i3, i4);
        if (i4 == -1) {
            return -1;
        }
        this.c += (long) i4;
        b(bArr2, i3, i4);
        return i4;
    }

    private final void b(byte[] bArr, int i, int i2) {
        i2 += i;
        while (true) {
            int i3 = i2 - i;
            if (i3 > 0) {
                int i4 = (int) (this.d % 4096);
                i3 = Math.min(i3, this.s.length - i4);
                System.arraycopy(bArr, i, this.s, i4, i3);
                this.r.a(this.s, i4, i3);
                this.d += (long) i3;
                if (this.r.b() == 4096) {
                    byte[] c = this.r.c();
                    ahdr ahdr = this.r;
                    if (ahdr instanceof Serializable) {
                        this.r = ahdp.a(this.k);
                    } else {
                        ahdr.a();
                    }
                    i4 = (int) ((this.d - 1) / 4096);
                    byte[][] bArr2 = this.o;
                    int length = bArr2.length;
                    bArr2[i4 % length] = c;
                    if ((i4 + 1) % length == 0) {
                        a(i4);
                    }
                }
                i += i3;
            } else {
                return;
            }
        }
    }

    public final void a() {
        this.a.a();
        this.e = null;
        int i = this.j;
        if (i != -1) {
            if (i > 0) {
                this.m.b(this.f, this.g);
            }
            long j = this.d;
            int i2;
            if (j == this.i) {
                i2 = (int) ((j - 1) / 4096);
                if (this.r.b() != 0) {
                    byte[][] bArr = this.o;
                    bArr[i2 % bArr.length] = this.r.c();
                }
                if (this.d % ((long) (this.o.length << 12)) != 0) {
                    a(i2);
                }
                d();
                String.valueOf(this.f).length();
                return;
            }
            d();
            i2 = (int) (this.d / 4096);
            i = this.o.length;
            int i3 = (i2 / i) * i;
            List arrayList = new ArrayList(i);
            for (i = i3; i < i2; i++) {
                agqg agqg = new agqg();
                agqg.a = this.f;
                agqg.b = this.g;
                agqg.c = this.h;
                agqg.d = 0;
                agqg.e = i;
                agqg.a(this.o[i - i3]);
                arrayList.add(agqg.a());
            }
            this.m.a(arrayList);
            i = this.r.b();
            if (i > 0) {
                if (!(this.r instanceof Serializable)) {
                    this.r = ahdp.b(this.k);
                    this.r.a(this.s, 0, i);
                }
                ahdr ahdr = this.r;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ObjectOutputStream(byteArrayOutputStream).writeObject(ahdr);
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                long j2 = this.d;
                agqg agqg2 = new agqg();
                agqg2.a = this.f;
                agqg2.b = this.g;
                agqg2.c = this.h;
                agqg2.d = 0;
                agqg2.e = (int) (j2 / 4096);
                agqg2.g = Arrays.copyOf(toByteArray, toByteArray.length);
                this.m.a(agqg2.a());
            }
        }
    }

    public final Uri b() {
        return this.a.b();
    }

    private final void a(int i) {
        this.q.a();
        int length = this.o.length;
        int i2 = i / length;
        i = (i % length) + 1;
        for (length = 0; length < i; length++) {
            this.q.a(this.o[length]);
        }
        agqg agqg = new agqg();
        agqg.a = this.f;
        agqg.b = this.g;
        agqg.c = this.h;
        agqg.d = this.j;
        agqg.e = i2;
        agqg.a(this.q.b());
        this.p.add(agqg.a());
        if (this.p.size() >= 256) {
            d();
        }
    }

    private final void d() {
        this.m.a(this.p);
        this.p.clear();
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
