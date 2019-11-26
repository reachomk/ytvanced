package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: bako */
public class bako implements civ, Closeable, Iterator {
    private static final cis a = new bakr("eof ");
    private cis b = null;
    private List c = new ArrayList();
    public cij h;
    public bakq i;
    public long j = 0;
    public long k = 0;
    public long l = 0;

    public final List b() {
        if (this.i == null || this.b == a) {
            return this.c;
        }
        return new bane(this.c, this);
    }

    /* Access modifiers changed, original: protected|final */
    public final long n() {
        long j = 0;
        for (int i = 0; i < b().size(); i++) {
            j += ((cis) this.c.get(i)).d();
        }
        return j;
    }

    public final List a(Class cls) {
        List b = b();
        List list = null;
        Object obj = null;
        for (int i = 0; i < b.size(); i++) {
            cis cis = (cis) b.get(i);
            if (cls.isInstance(cis)) {
                if (obj == null) {
                    obj = cis;
                } else {
                    if (list == null) {
                        list = new ArrayList(2);
                        list.add(obj);
                    }
                    list.add(cis);
                }
            }
        }
        if (list != null) {
            return list;
        }
        if (obj != null) {
            return Collections.singletonList(obj);
        }
        return Collections.emptyList();
    }

    public final void a(cis cis) {
        if (cis != null) {
            this.c = new ArrayList(b());
            cis.a((civ) this);
            this.c.add(cis);
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        cis cis = this.b;
        if (cis == a) {
            return false;
        }
        if (cis != null) {
            return true;
        }
        try {
            this.b = a();
            return true;
        } catch (NoSuchElementException unused) {
            this.b = a;
            return false;
        }
    }

    private final cis a() {
        cis cis = this.b;
        if (cis == null || cis == a) {
            bakq bakq = this.i;
            if (bakq == null || this.j >= this.l) {
                this.b = a;
                throw new NoSuchElementException();
            }
            try {
                cis a;
                synchronized (bakq) {
                    this.i.a(this.j);
                    a = this.h.a(this.i, this);
                    this.j = this.i.b();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.b = null;
        return cis;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("[");
        for (int i = 0; i < this.c.size(); i++) {
            if (i > 0) {
                stringBuilder.append(";");
            }
            stringBuilder.append(((cis) this.c.get(i)).toString());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void b(WritableByteChannel writableByteChannel) {
        for (cis a : b()) {
            a.a(writableByteChannel);
        }
    }

    public final ByteBuffer a(long j, long j2) {
        long j3 = j2;
        bakq bakq = this.i;
        ByteBuffer a;
        if (bakq != null) {
            synchronized (bakq) {
                a = this.i.a(this.k + j, j3);
            }
            return a;
        }
        a = ByteBuffer.allocate(bana.a(j2));
        j3 = j + j3;
        long j4 = 0;
        for (cis cis : this.c) {
            long d = cis.d() + j4;
            if (d > j && j4 < j3) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel = Channels.newChannel(byteArrayOutputStream);
                cis.a(newChannel);
                newChannel.close();
                if (j4 >= j && d <= j3) {
                    a.put(byteArrayOutputStream.toByteArray());
                } else if (j4 < j && d > j3) {
                    j4 = j - j4;
                    a.put(byteArrayOutputStream.toByteArray(), bana.a(j4), bana.a((cis.d() - j4) - (d - j3)));
                } else if (j4 < j && d <= j3) {
                    j4 = j - j4;
                    a.put(byteArrayOutputStream.toByteArray(), bana.a(j4), bana.a(cis.d() - j4));
                } else if (j4 >= j && d > j3) {
                    a.put(byteArrayOutputStream.toByteArray(), 0, bana.a(cis.d() - (d - j3)));
                }
            }
            j4 = d;
        }
        return (ByteBuffer) a.rewind();
    }

    public void close() {
        this.i.close();
    }

    public final /* synthetic */ Object next() {
        return a();
    }

    static {
        bang.a(bako.class);
    }
}
