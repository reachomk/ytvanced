package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bald */
final class bald implements cis {
    private List a;
    private List b = new ArrayList();
    private civ c;
    private long d;

    private static boolean a(long j) {
        return j + 8 < 4294967296L;
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
    }

    public final civ c() {
        return this.c;
    }

    public final String f() {
        return "mdat";
    }

    public final void a(civ civ) {
        this.c = civ;
    }

    public final long e() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    public final long d() {
        return this.d + 16;
    }

    public final void a(WritableByteChannel writableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        long d = d();
        if (bald.a(d)) {
            cin.a(allocate, d);
        } else {
            cin.a(allocate, 1);
        }
        allocate.put(cil.a("mdat"));
        if (bald.a(d)) {
            allocate.put(new byte[8]);
        } else {
            allocate.putLong(d);
        }
        allocate.rewind();
        writableByteChannel.write(allocate);
        for (List<bakz> it : this.b) {
            for (bakz a : it) {
                a.a(writableByteChannel);
            }
        }
    }

    /* synthetic */ bald(bala bala, bakx bakx, Map map, long j) {
        this.d = j;
        this.a = bakx.d;
        for (int i = 0; i < ((int[]) map.values().iterator().next()).length; i++) {
            for (baky baky : this.a) {
                int[] iArr = (int[]) map.get(baky);
                long j2 = 0;
                for (int i2 = 0; i2 < i; i2++) {
                    j2 += (long) iArr[i2];
                }
                this.b.add(((List) bala.a.get(baky)).subList(bana.a(j2), bana.a(j2 + ((long) iArr[i]))));
            }
        }
    }
}
