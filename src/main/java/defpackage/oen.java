package defpackage;

/* renamed from: oen */
public final class oen extends owb {
    public oen(ovm ovm, long j) {
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("Load timeout exceeded: ");
        stringBuilder.append(j);
        super(stringBuilder.toString(), ovm, 2);
    }
}
