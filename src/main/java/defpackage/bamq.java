package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bamq */
public final class bamq extends bamr {
    private short a;
    private short b;
    private final List c = new LinkedList();
    private int d;
    private int e;
    private short f;

    public final String a() {
        return "rash";
    }

    public final void a(ByteBuffer byteBuffer) {
        int i = byteBuffer.getShort();
        this.a = i;
        if (i != 1) {
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                this.c.add(new bamt(bana.a(cio.a(byteBuffer)), byteBuffer.getShort()));
                i = i2;
            }
        } else {
            this.b = byteBuffer.getShort();
        }
        this.d = bana.a(cio.a(byteBuffer));
        this.e = bana.a(cio.a(byteBuffer));
        this.f = (short) cio.d(byteBuffer);
    }

    public final ByteBuffer b() {
        short s = this.a;
        ByteBuffer allocate = ByteBuffer.allocate(s != (short) 1 ? (s * 6) + 11 : 13);
        allocate.putShort(this.a);
        if (this.a == (short) 1) {
            allocate.putShort(this.b);
        } else {
            for (bamt bamt : this.c) {
                allocate.putInt(bamt.a);
                allocate.putShort(bamt.b);
            }
        }
        allocate.putInt(this.d);
        allocate.putInt(this.e);
        cin.c(allocate, this.f);
        allocate.rewind();
        return allocate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bamq bamq = (bamq) obj;
            if (this.f == bamq.f && this.d == bamq.d && this.e == bamq.e && this.a == bamq.a && this.b == bamq.b) {
                List list = this.c;
                List list2 = bamq.c;
                return list == null ? list2 == null : list.equals(list2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        List list = this.c;
        return ((((((i + (list != null ? list.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }
}
