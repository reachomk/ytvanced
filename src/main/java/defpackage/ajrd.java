package defpackage;

/* renamed from: ajrd */
abstract class ajrd extends aoca {
    public Object a = null;
    private int b = 0;

    ajrd() {
    }

    public final void a(int i, Object obj) {
        this.b = i;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajrd) {
            Object obj2 = this.a;
            obj = ((ajrd) obj).a;
            boolean z = true;
            if (obj2 != obj) {
                if (obj2 == null) {
                    z = false;
                } else if (obj2.equals(obj)) {
                    return z;
                }
            }
            return z;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((getClass().hashCode() + 1147) * 31) + this.b) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final void writeTo(aoby aoby) {
        Object obj = this.a;
        if (obj instanceof aocf) {
            aoby.a(this.b, (aocf) obj);
        } else if (obj instanceof anze) {
            aoby.a(this.b, (anze) obj);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Object obj = this.a;
        if (obj instanceof aocf) {
            computeSerializedSize += aoby.b(this.b, (aocf) obj);
        } else if (obj instanceof anze) {
            return computeSerializedSize + (aoby.h(this.b) + anwm.b((anze) obj));
        }
        return computeSerializedSize;
    }
}
