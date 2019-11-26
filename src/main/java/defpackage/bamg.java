package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@bamh(a = {3})
/* renamed from: bamg */
public final class bamg extends bama {
    private static Logger g = Logger.getLogger(bamg.class.getName());
    public int d;
    public bamf e;
    public bamm f;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = 0;
    private String m;
    private int n;
    private int o;
    private final List p = new ArrayList();

    public final void a(ByteBuffer byteBuffer) {
        String valueOf;
        long position;
        bamg bamg = this;
        ByteBuffer byteBuffer2 = byteBuffer;
        bamg.d = cio.c(byteBuffer);
        int d = cio.d(byteBuffer);
        int i = d >>> 7;
        bamg.h = i;
        bamg.i = (d >>> 6) & 1;
        bamg.j = (d >>> 5) & 1;
        bamg.k = d & 31;
        if (i == 1) {
            bamg.n = cio.c(byteBuffer);
        }
        if (bamg.i == 1) {
            d = cio.d(byteBuffer);
            bamg.l = d;
            bamg.m = cio.a(byteBuffer2, d);
        }
        if (bamg.j == 1) {
            bamg.o = cio.c(byteBuffer);
        }
        int i2 = 0;
        d = ((bamg.c + 4) + (bamg.h == 1 ? 2 : 0)) + (bamg.i == 1 ? bamg.l + 1 : 0);
        if (bamg.j == 1) {
            i2 = 2;
        }
        d += i2;
        i = byteBuffer.position();
        String str = ", size: ";
        String str2 = "parseDetail";
        String str3 = "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor";
        if (a() > d + 2) {
            bama a = bamk.a(-1, byteBuffer2);
            long position2 = (long) (byteBuffer.position() - i);
            Logger logger = g;
            Level level = Level.FINER;
            valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(a != null ? Integer.valueOf(a.a()) : null);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 51) + valueOf2.length());
            stringBuilder.append(valueOf);
            stringBuilder.append(" - ESDescriptor1 read: ");
            stringBuilder.append(position2);
            stringBuilder.append(str);
            stringBuilder.append(valueOf2);
            logger.logp(level, str3, str2, stringBuilder.toString());
            if (a != null) {
                int a2 = a.a();
                byteBuffer2.position(i + a2);
                d += a2;
            } else {
                d = (int) (((long) d) + position2);
            }
            if (a instanceof bamf) {
                bamg.e = (bamf) a;
            }
        }
        i = byteBuffer.position();
        if (a() > d + 2) {
            bama a3 = bamk.a(-1, byteBuffer2);
            position = (long) (byteBuffer.position() - i);
            Logger logger2 = g;
            Level level2 = Level.FINER;
            String valueOf3 = String.valueOf(a3);
            String valueOf4 = String.valueOf(a3 != null ? Integer.valueOf(a3.a()) : null);
            StringBuilder stringBuilder2 = new StringBuilder((valueOf3.length() + 51) + valueOf4.length());
            stringBuilder2.append(valueOf3);
            stringBuilder2.append(" - ESDescriptor2 read: ");
            stringBuilder2.append(position);
            stringBuilder2.append(str);
            stringBuilder2.append(valueOf4);
            logger2.logp(level2, str3, str2, stringBuilder2.toString());
            if (a3 != null) {
                int a4 = a3.a();
                byteBuffer2.position(i + a4);
                d += a4;
            } else {
                d = (int) (((long) d) + position);
            }
            if (a3 instanceof bamm) {
                bamg = this;
                bamg.f = (bamm) a3;
            } else {
                bamg = this;
            }
        } else {
            g.logp(Level.WARNING, str3, str2, "SLConfigDescriptor is missing!");
        }
        while (a() - d > 2) {
            i = byteBuffer.position();
            bama a5 = bamk.a(-1, byteBuffer2);
            position = (long) (byteBuffer.position() - i);
            Logger logger3 = g;
            Level level3 = Level.FINER;
            String valueOf5 = String.valueOf(a5);
            valueOf = String.valueOf(a5 != null ? Integer.valueOf(a5.a()) : null);
            StringBuilder stringBuilder3 = new StringBuilder((valueOf5.length() + 51) + valueOf.length());
            stringBuilder3.append(valueOf5);
            stringBuilder3.append(" - ESDescriptor3 read: ");
            stringBuilder3.append(position);
            stringBuilder3.append(str);
            stringBuilder3.append(valueOf);
            logger3.logp(level3, str3, str2, stringBuilder3.toString());
            if (a5 != null) {
                i2 = a5.a();
                byteBuffer2.position(i + i2);
                d += i2;
            } else {
                d = (int) (((long) d) + position);
            }
            bamg.p.add(a5);
        }
    }

    private final int c() {
        int i = this.h > 0 ? 7 : 5;
        if (this.i > 0) {
            i += this.l + 1;
        }
        if (this.j > 0) {
            i += 2;
        }
        return (i + this.e.b()) + 3;
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(c());
        cin.c(allocate, 3);
        cin.c(allocate, c() - 2);
        cin.b(allocate, this.d);
        cin.c(allocate, (((this.h << 7) | (this.i << 6)) | (this.j << 5)) | (this.k & 31));
        if (this.h > 0) {
            cin.b(allocate, this.n);
        }
        if (this.i > 0) {
            cin.c(allocate, this.l);
            allocate.put(ciq.a(this.m));
            cin.c(allocate, 0);
        }
        if (this.j > 0) {
            cin.b(allocate, this.o);
        }
        bamf bamf = this.e;
        ByteBuffer allocate2 = ByteBuffer.allocate(bamf.b());
        cin.c(allocate2, 4);
        cin.c(allocate2, bamf.b() - 2);
        cin.c(allocate2, bamf.d);
        int i = bamf.e;
        int i2 = bamf.f;
        cin.c(allocate2, ((i << 2) | (i2 + i2)) | 1);
        cin.a(allocate2, bamf.g);
        cin.a(allocate2, bamf.h);
        cin.a(allocate2, bamf.i);
        bamb bamb = bamf.j;
        if (bamb != null) {
            ByteBuffer allocate3 = ByteBuffer.allocate(bamb.b());
            cin.c(allocate3, 5);
            bamb.b();
            cin.c(allocate3, 2);
            bamc bamc = new bamc(allocate3);
            bamc.a(bamb.d, 5);
            bamc.a(bamb.e, 4);
            if (bamb.e != 15) {
                bamc.a(bamb.f, 4);
                allocate2.put(allocate3.array());
            } else {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
        }
        bamm bamm = this.f;
        ByteBuffer allocate4 = ByteBuffer.allocate(3);
        cin.c(allocate4, 6);
        cin.c(allocate4, 1);
        cin.c(allocate4, bamm.d);
        allocate.put(allocate2.array());
        allocate.put(allocate4.array());
        return allocate;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ESDescriptor{esId=");
        stringBuilder.append(this.d);
        stringBuilder.append(", streamDependenceFlag=");
        stringBuilder.append(this.h);
        stringBuilder.append(", URLFlag=");
        stringBuilder.append(this.i);
        stringBuilder.append(", oCRstreamFlag=");
        stringBuilder.append(this.j);
        stringBuilder.append(", streamPriority=");
        stringBuilder.append(this.k);
        stringBuilder.append(", URLLength=");
        stringBuilder.append(this.l);
        stringBuilder.append(", URLString='");
        stringBuilder.append(this.m);
        stringBuilder.append("', remoteODFlag=0, dependsOnEsId=");
        stringBuilder.append(this.n);
        stringBuilder.append(", oCREsId=");
        stringBuilder.append(this.o);
        stringBuilder.append(", decoderConfigDescriptor=");
        stringBuilder.append(this.e);
        stringBuilder.append(", slConfigDescriptor=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bamg bamg = (bamg) obj;
            if (this.i == bamg.i && this.l == bamg.l && this.n == bamg.n && this.d == bamg.d && this.o == bamg.o && this.j == bamg.j && this.h == bamg.h && this.k == bamg.k) {
                String str = this.m;
                if (!str == null ? str.equals(bamg.m) : bamg.m == null) {
                    return false;
                }
                bamf bamf = this.e;
                if (!bamf == null ? bamf.equals(bamg.e) : bamg.e == null) {
                    return false;
                }
                List list = this.p;
                if (!list == null ? list.equals(bamg.p) : bamg.p == null) {
                    return false;
                }
                bamm bamm = this.f;
                bamm bamm2 = bamg.f;
                return bamm == null ? bamm2 == null : bamm.equals(bamm2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((((this.d * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31;
        String str = this.m;
        int i2 = 0;
        i = (((((i + (str != null ? str.hashCode() : 0)) * 961) + this.n) * 31) + this.o) * 31;
        bamf bamf = this.e;
        i = (i + (bamf != null ? bamf.hashCode() : 0)) * 31;
        bamm bamm = this.f;
        i = (i + (bamm != null ? bamm.d : 0)) * 31;
        List list = this.p;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }
}
