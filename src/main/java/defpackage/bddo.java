package defpackage;

/* renamed from: bddo */
public final class bddo extends bddb {
    public bddo() {
        this.consumerNode.lazySet(null);
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            bdcv bdcv = new bdcv(obj);
            this.producerNode.lazySet(bdcv);
            this.producerNode = bdcv;
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public final Object poll() {
        bdcv b = this.consumerNode.b();
        if (b == null) {
            return null;
        }
        Object a = b.a();
        this.consumerNode = b;
        return a;
    }

    public final Object peek() {
        bdcv b = this.consumerNode.b();
        return b != null ? b.a : null;
    }
}
