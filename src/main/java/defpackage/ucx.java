package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* renamed from: ucx */
public final class ucx {
    public final ArrayList a = new ArrayList();
    private final ucz b;
    private final double c = 1.2d;
    private final int d;
    private final Random e;

    public ucx(ucz ucz, udq udq, int i, Random random) {
        this.b = ucz;
        this.d = i;
        this.e = random;
        if (udq != null) {
            for (udo udo : udq.b) {
                this.a.add((udo.a & 1) != 0 ? Integer.valueOf(udo.b) : null);
            }
        }
    }

    public final synchronized void a(int i) {
        if (this.a.size() + 1 > 100) {
            ArrayList arrayList = this.a;
            arrayList.remove(this.e.nextInt(arrayList.size()));
        }
        this.a.add(Integer.valueOf(i));
        udt udt = (udt) udq.d.createBuilder();
        int i2 = this.d;
        udt.copyOnWrite();
        udq udq = (udq) udt.instance;
        udq.a |= 1;
        udq.c = i2;
        int i3 = 0;
        while (i3 < this.a.size()) {
            udr udr = (udr) udo.c.createBuilder();
            int intValue = ((Integer) this.a.get(i3)).intValue();
            udr.copyOnWrite();
            udo udo = (udo) udr.instance;
            udo.a |= 1;
            udo.b = intValue;
            udo udo2 = (udo) ((anxl) udr.build());
            udt.copyOnWrite();
            udq udq2 = (udq) udt.instance;
            if (udo2 != null) {
                if (!udq2.b.a()) {
                    udq2.b = anxl.mutableCopy(udq2.b);
                }
                udq2.b.add(udo2);
                i3++;
            } else {
                throw new NullPointerException();
            }
        }
        if (!this.b.a("primes.miniheapdump.memorySamples", (udq) ((anxl) udt.build()))) {
            tyv.b("MhdMemorySampler", "Failed to save mini heap dump memory samples.", new Object[0]);
        }
    }

    public final double b(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        double d = 0.0d;
        for (int i2 = 0; i2 < size; i2++) {
            if (i >= ((Integer) arrayList.get(i2)).intValue()) {
                d += 1.0d;
            }
        }
        double size2 = (double) this.a.size();
        Double.isNaN(size2);
        return d / size2;
    }

    public final boolean a() {
        if (this.a.size() == 100) {
            double d = this.c;
            double intValue = (double) ((Integer) Collections.min(this.a)).intValue();
            Double.isNaN(intValue);
            if (d * intValue <= ((double) ((Integer) Collections.max(this.a)).intValue())) {
                return true;
            }
        }
        return false;
    }
}
