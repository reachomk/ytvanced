package defpackage;

/* renamed from: dar */
final class dar implements ddf {
    private final /* synthetic */ dad a;

    dar(dad dad) {
        this.a = dad;
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        dad dad = this.a;
        dad.v = i;
        dad.w = i2;
        dad.A.b = false;
        dad.n();
        dad = this.a;
        if (dad.x != null) {
            int max = Math.max(dad.x.a, i2 - i);
            int i6 = (int) (((float) max) * dad.j);
            max = Math.min((max + i) + i6, dad.b.size() - 1);
            for (int max2 = Math.max(0, i - i6); max2 <= max; max2++) {
                ((cyl) dad.b.get(max2)).a(max2, i, i2, i3, i4);
            }
        }
    }
}
