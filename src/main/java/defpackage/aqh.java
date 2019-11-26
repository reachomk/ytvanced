package defpackage;

/* renamed from: aqh */
public final class aqh {
    public int a = -1;
    public int b = 0;
    public int c = 0;
    public int d = 1;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int l;
    public long m;
    public int n;
    public int o;
    public int p;

    public final void a(int i) {
        if ((this.d & i) == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Layout state should be one of ");
            stringBuilder.append(Integer.toBinaryString(i));
            stringBuilder.append(" but it is ");
            stringBuilder.append(Integer.toBinaryString(this.d));
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final boolean a() {
        return this.a != -1;
    }

    public final int b() {
        return this.g ? this.b - this.c : this.e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("State{mTargetPosition=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mData=");
        stringBuilder.append(null);
        stringBuilder.append(", mItemCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mIsMeasuring=");
        stringBuilder.append(this.i);
        stringBuilder.append(", mPreviousLayoutItemCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mStructureChanged=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mInPreLayout=");
        stringBuilder.append(this.g);
        stringBuilder.append(", mRunSimpleAnimations=");
        stringBuilder.append(this.j);
        stringBuilder.append(", mRunPredictiveAnimations=");
        stringBuilder.append(this.k);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
