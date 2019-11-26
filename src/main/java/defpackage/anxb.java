package defpackage;

import java.nio.ByteBuffer;
import java.util.Map.Entry;

/* renamed from: anxb */
final class anxb extends anxc {
    anxb() {
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anze anze) {
        return anze instanceof anxp;
    }

    /* Access modifiers changed, original: final */
    public final anxg a(Object obj) {
        return ((anxp) obj).h;
    }

    /* Access modifiers changed, original: final */
    public final anxg b(Object obj) {
        return ((anxp) obj).a();
    }

    /* Access modifiers changed, original: final */
    public final void c(Object obj) {
        a(obj).b();
    }

    /* Access modifiers changed, original: final */
    public final Object a(anzt anzt, Object obj, anxa anxa, anxg anxg, Object obj2, aoar aoar) {
        Object valueOf;
        anxr anxr = (anxr) obj;
        int a = anxr.a();
        if (anxr.c() != aobm.ENUM) {
            switch (anxr.c().ordinal()) {
                case 0:
                    valueOf = Double.valueOf(anzt.d());
                    break;
                case 1:
                    valueOf = Float.valueOf(anzt.e());
                    break;
                case 2:
                    valueOf = Long.valueOf(anzt.g());
                    break;
                case 3:
                    valueOf = Long.valueOf(anzt.f());
                    break;
                case 4:
                    valueOf = Integer.valueOf(anzt.h());
                    break;
                case 5:
                    valueOf = Long.valueOf(anzt.i());
                    break;
                case 6:
                    valueOf = Integer.valueOf(anzt.j());
                    break;
                case 7:
                    valueOf = Boolean.valueOf(anzt.k());
                    break;
                case 8:
                    valueOf = anzt.l();
                    break;
                case 9:
                    valueOf = anzt.b(anxr.c.getClass(), anxa);
                    break;
                case 10:
                    valueOf = anzt.a(anxr.c.getClass(), anxa);
                    break;
                case 11:
                    valueOf = anzt.n();
                    break;
                case 12:
                    valueOf = Integer.valueOf(anzt.o());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    valueOf = Integer.valueOf(anzt.q());
                    break;
                case 15:
                    valueOf = Long.valueOf(anzt.r());
                    break;
                case 16:
                    valueOf = Integer.valueOf(anzt.s());
                    break;
                case 17:
                    valueOf = Long.valueOf(anzt.t());
                    break;
                default:
                    valueOf = null;
                    break;
            }
        }
        int h = anzt.h();
        if (anxr.d.a.findValueByNumber(h) == null) {
            return aoab.a(a, h, obj2, aoar);
        }
        valueOf = Integer.valueOf(h);
        int ordinal = anxr.c().ordinal();
        if (ordinal == 9 || ordinal == 10) {
            Object b = anxg.b(anxr.d);
            if (b != null) {
                valueOf = anxw.a(b, valueOf);
            }
        }
        anxg.a(anxr.d, valueOf);
        return obj2;
    }

    /* Access modifiers changed, original: final */
    public final int a(Entry entry) {
        return ((anxs) entry.getKey()).b;
    }

    /* Access modifiers changed, original: final */
    public final void a(aobl aobl, Entry entry) {
        anxs anxs = (anxs) entry.getKey();
        switch (anxs.c.ordinal()) {
            case 0:
                aobl.a(anxs.b, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                aobl.a(anxs.b, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                aobl.a(anxs.b, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                aobl.c(anxs.b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                aobl.c(anxs.b, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                aobl.d(anxs.b, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                aobl.d(anxs.b, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                aobl.a(anxs.b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                aobl.a(anxs.b, (String) entry.getValue());
                return;
            case 9:
                aobl.b(anxs.b, entry.getValue(), anzs.a.a(entry.getValue().getClass()));
                break;
            case 10:
                aobl.a(anxs.b, entry.getValue(), anzs.a.a(entry.getValue().getClass()));
                return;
            case 11:
                aobl.a(anxs.b, (anvu) entry.getValue());
                return;
            case 12:
                aobl.e(anxs.b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                aobl.c(anxs.b, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                aobl.a(anxs.b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                aobl.b(anxs.b, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                aobl.f(anxs.b, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                aobl.e(anxs.b, ((Long) entry.getValue()).longValue());
                return;
        }
    }

    /* Access modifiers changed, original: final */
    public final Object a(anxa anxa, anze anze, int i) {
        return anxa.a(anze, i);
    }

    /* Access modifiers changed, original: final */
    public final void a(anzt anzt, Object obj, anxa anxa, anxg anxg) {
        anxr anxr = (anxr) obj;
        anxg.a(anxr.d, anzt.a(anxr.c.getClass(), anxa));
    }

    /* Access modifiers changed, original: final */
    public final void a(anvu anvu, Object obj, anxa anxa, anxg anxg) {
        anxr anxr = (anxr) obj;
        Object buildPartial = anxr.c.newBuilderForType().buildPartial();
        ByteBuffer wrap = ByteBuffer.wrap(anvu.d());
        if (wrap.hasArray()) {
            anvq anvq = new anvq(wrap);
            anzs.a.a(buildPartial).a(buildPartial, anvq, anxa);
            anxg.a(anxr.d, buildPartial);
            if (anvq.a() != Integer.MAX_VALUE) {
                throw anyg.e();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
