package defpackage;

/* renamed from: aaju */
public enum aaju {
    RECTANGULAR_2D,
    SPHERICAL,
    SPHERICAL_3D,
    RECTANGULAR_3D,
    NOOP,
    MESH;

    public final boolean a() {
        return this == SPHERICAL || this == SPHERICAL_3D || this == MESH;
    }
}
