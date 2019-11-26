package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bamv */
public final class bamv extends bakp {
    public List a = new LinkedList();
    private int b;

    public bamv() {
        super("sgpd");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        long j = (m() == 1 ? 12 : 8) + 4;
        for (bamr bamr : this.a) {
            if (m() == 1 && this.b == 0) {
                j += 4;
            }
            j += (long) bamr.c();
        }
        return j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        byteBuffer.put(cil.a(((bamr) this.a.get(0)).a()));
        if (m() == 1) {
            cin.a(byteBuffer, (long) this.b);
        }
        cin.a(byteBuffer, (long) this.a.size());
        for (bamr bamr : this.a) {
            if (m() == 1 && this.b == 0) {
                cin.a(byteBuffer, (long) bamr.b().limit());
            }
            byteBuffer.put(bamr.b());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        if (m() == 1) {
            String j = cio.j(byteBuffer);
            if (m() == 1) {
                this.b = bana.a(cio.a(byteBuffer));
            }
            long a = cio.a(byteBuffer);
            while (true) {
                long j2 = -1 + a;
                if (a > 0) {
                    int i = this.b;
                    if (m() == 1) {
                        bamr bams;
                        if (this.b == 0) {
                            i = bana.a(cio.a(byteBuffer));
                        }
                        int position = byteBuffer.position() + i;
                        ByteBuffer slice = byteBuffer.slice();
                        slice.limit(i);
                        List list = this.a;
                        if ("roll".equals(j)) {
                            bams = new bams();
                        } else if ("rash".equals(j)) {
                            bams = new bamq();
                        } else if ("seig".equals(j)) {
                            bams = new bamo();
                        } else if ("rap ".equals(j)) {
                            bams = new bamy();
                        } else if ("tele".equals(j)) {
                            bams = new bamw();
                        } else if ("sync".equals(j)) {
                            bams = new banm();
                        } else if ("tscl".equals(j)) {
                            bams = new banp();
                        } else if ("tsas".equals(j)) {
                            bams = new bano();
                        } else if ("stsa".equals(j)) {
                            bams = new bann();
                        } else {
                            bams = new bamz(j);
                        }
                        bams.a(slice);
                        list.add(bams);
                        byteBuffer.position(position);
                        a = j2;
                    } else {
                        throw new RuntimeException("This should be implemented");
                    }
                }
                return;
            }
        }
        throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bamv bamv = (bamv) obj;
            if (this.b == bamv.b) {
                List list = this.a;
                List list2 = bamv.a;
                return list == null ? list2 == null : list.equals(list2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        List list = this.a;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Object a = this.a.size() > 0 ? ((bamr) this.a.get(0)).a() : "????";
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 84) + valueOf.length());
        stringBuilder.append("SampleGroupDescriptionBox{groupingType='");
        stringBuilder.append(a);
        stringBuilder.append("', defaultLength=");
        stringBuilder.append(i);
        stringBuilder.append(", groupEntries=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
