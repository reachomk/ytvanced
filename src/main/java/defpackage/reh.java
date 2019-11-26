package defpackage;

import java.nio.ByteBuffer;
import java.util.Map.Entry;

/* renamed from: reh */
final class reh extends rei {
    reh() {
    }

    /* Access modifiers changed, original: final */
    public final boolean a(rgh rgh) {
        return rgh instanceof rev;
    }

    /* Access modifiers changed, original: final */
    public final rem a(Object obj) {
        return ((rev) obj).zzuhx;
    }

    /* Access modifiers changed, original: final */
    public final rem b(Object obj) {
        rem a = a(obj);
        if (!a.b) {
            return a;
        }
        a = (rem) a.clone();
        ((rev) obj).zzuhx = a;
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void c(Object obj) {
        a(obj).b();
    }

    /* Access modifiers changed, original: final */
    public final Object a(rgx rgx, reg reg, rem rem, Object obj, rhp rhp) {
        Object valueOf;
        reo reo = null;
        int i = reo.b;
        if (reo.c != rii.ENUM) {
            switch (reo.c) {
                case DOUBLE:
                    valueOf = Double.valueOf(rgx.d());
                    break;
                case FLOAT:
                    valueOf = Float.valueOf(rgx.e());
                    break;
                case INT64:
                    valueOf = Long.valueOf(rgx.g());
                    break;
                case UINT64:
                    valueOf = Long.valueOf(rgx.f());
                    break;
                case INT32:
                    valueOf = Integer.valueOf(rgx.h());
                    break;
                case FIXED64:
                    valueOf = Long.valueOf(rgx.i());
                    break;
                case FIXED32:
                    valueOf = Integer.valueOf(rgx.j());
                    break;
                case BOOL:
                    valueOf = Boolean.valueOf(rgx.k());
                    break;
                case UINT32:
                    valueOf = Integer.valueOf(rgx.o());
                    break;
                case SFIXED32:
                    valueOf = Integer.valueOf(rgx.q());
                    break;
                case SFIXED64:
                    valueOf = Long.valueOf(rgx.r());
                    break;
                case SINT32:
                    valueOf = Integer.valueOf(rgx.s());
                    break;
                case SINT64:
                    valueOf = Long.valueOf(rgx.t());
                    break;
                case ENUM:
                    throw new IllegalStateException("Shouldn't reach here.");
                case BYTES:
                    valueOf = rgx.n();
                    break;
                case STRING:
                    valueOf = rgx.l();
                    break;
                case GROUP:
                    valueOf = rgx.b(reo.getClass(), reg);
                    break;
                case MESSAGE:
                    valueOf = rgx.a(reo.getClass(), reg);
                    break;
                default:
                    valueOf = reo;
                    break;
            }
        }
        int h = rgx.h();
        if (reo.a.a(h) == null) {
            return rhc.a(i, h, obj, rhp);
        }
        valueOf = Integer.valueOf(h);
        int i2 = rek.a[reo.c.ordinal()];
        if (i2 == 17 || i2 == 18) {
            Object a = rem.a(reo);
            if (a != null) {
                valueOf = rfc.a(a, valueOf);
            }
        }
        rem.a(reo, valueOf);
        return obj;
    }

    /* Access modifiers changed, original: final */
    public final int a(Entry entry) {
        return ((rey) entry.getKey()).b;
    }

    /* Access modifiers changed, original: final */
    public final void a(rik rik, Entry entry) {
        rey rey = (rey) entry.getKey();
        switch (rey.c) {
            case DOUBLE:
                rik.a(rey.b, ((Double) entry.getValue()).doubleValue());
                break;
            case FLOAT:
                rik.a(rey.b, ((Float) entry.getValue()).floatValue());
                return;
            case INT64:
                rik.a(rey.b, ((Long) entry.getValue()).longValue());
                return;
            case UINT64:
                rik.c(rey.b, ((Long) entry.getValue()).longValue());
                return;
            case INT32:
                rik.c(rey.b, ((Integer) entry.getValue()).intValue());
                return;
            case FIXED64:
                rik.d(rey.b, ((Long) entry.getValue()).longValue());
                return;
            case FIXED32:
                rik.d(rey.b, ((Integer) entry.getValue()).intValue());
                return;
            case BOOL:
                rik.a(rey.b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case UINT32:
                rik.e(rey.b, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED32:
                rik.a(rey.b, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED64:
                rik.b(rey.b, ((Long) entry.getValue()).longValue());
                return;
            case SINT32:
                rik.f(rey.b, ((Integer) entry.getValue()).intValue());
                return;
            case SINT64:
                rik.e(rey.b, ((Long) entry.getValue()).longValue());
                return;
            case ENUM:
                rik.c(rey.b, ((Integer) entry.getValue()).intValue());
                return;
            case BYTES:
                rik.a(rey.b, (rdg) entry.getValue());
                return;
            case STRING:
                rik.a(rey.b, (String) entry.getValue());
                return;
            case GROUP:
                rik.b(rey.b, entry.getValue(), rgw.a.a(entry.getValue().getClass()));
                return;
            case MESSAGE:
                rik.a(rey.b, entry.getValue(), rgw.a.a(entry.getValue().getClass()));
                break;
        }
    }

    /* Access modifiers changed, original: final */
    public final Object a(reg reg, rgh rgh, int i) {
        return (rex) reg.c.get(new ref(rgh, i));
    }

    /* Access modifiers changed, original: final */
    public final void a(rgx rgx, reg reg, rem rem) {
        reo reo = null;
        rem.a(reo, rgx.a(reo.getClass(), reg));
    }

    /* Access modifiers changed, original: final */
    public final void a(rdg rdg, reg reg, rem rem) {
        reo reo = null;
        Object e = reo.j().e();
        ByteBuffer wrap = ByteBuffer.wrap(rdg.b());
        if (wrap.hasArray()) {
            rdb rdb = new rdb(wrap);
            rgw.a.a(e).a(e, rdb, reg);
            rem.a(reo, e);
            if (rdb.a() != Integer.MAX_VALUE) {
                throw rfk.e();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
