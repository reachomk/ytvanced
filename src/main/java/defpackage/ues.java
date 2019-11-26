package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ues */
public final class ues implements Externalizable {
    public static final long serialVersionUID = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private ueu H = null;
    private boolean I;
    private boolean J;
    private ueu K = null;
    private boolean L;
    private ueu M = null;
    private boolean N;
    private ueu O = null;
    private boolean P;
    private ueu Q = null;
    private boolean R;
    private ueu S = null;
    private String T;
    private boolean U;
    private String V;
    private boolean W;
    private String X;
    private boolean Y;
    private boolean Z;
    public ueu a = null;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    public ueu b = null;
    public ueu c = null;
    public ueu d = null;
    public ueu e = null;
    public ueu f = null;
    public ueu g = null;
    public ueu h = null;
    public ueu i = null;
    public ueu j = null;
    public ueu k = null;
    public int l;
    public String m;
    public boolean n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public final List s;
    public final List t;
    public boolean u;
    public String v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ues() {
        String str = "";
        this.T = str;
        this.l = 0;
        this.m = str;
        this.V = str;
        this.X = str;
        this.o = str;
        this.p = str;
        this.q = str;
        this.r = false;
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.aa = false;
        this.v = str;
        this.ab = false;
        this.ac = false;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.w);
        if (this.w) {
            this.a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B);
        if (this.B) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D);
        if (this.D) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F);
        if (this.F) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I);
        if (this.I) {
            this.k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.J);
        if (this.J) {
            this.K.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L);
        if (this.L) {
            this.M.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N);
        if (this.N) {
            this.O.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P);
        if (this.P) {
            this.Q.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.R);
        if (this.R) {
            this.S.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.T);
        objectOutput.writeInt(this.l);
        objectOutput.writeUTF(this.m);
        objectOutput.writeBoolean(this.U);
        if (this.U) {
            objectOutput.writeUTF(this.V);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            objectOutput.writeUTF(this.X);
        }
        objectOutput.writeBoolean(this.n);
        if (this.n) {
            objectOutput.writeUTF(this.o);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            objectOutput.writeUTF(this.p);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.q);
        }
        objectOutput.writeBoolean(this.r);
        int size = this.s.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((uet) this.s.get(i)).writeExternal(objectOutput);
        }
        size = this.t.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((uet) this.t.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.aa);
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            objectOutput.writeUTF(this.v);
        }
        objectOutput.writeBoolean(this.ab);
        objectOutput.writeBoolean(this.ac);
    }

    public final void readExternal(ObjectInput objectInput) {
        ueu ueu;
        String readUTF;
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.w = true;
            this.a = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.x = true;
            this.b = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.y = true;
            this.c = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.z = true;
            this.d = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.A = true;
            this.e = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.B = true;
            this.f = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.C = true;
            this.g = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.D = true;
            this.h = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.E = true;
            this.i = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.F = true;
            this.j = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.G = true;
            this.H = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.I = true;
            this.k = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.J = true;
            this.K = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.L = true;
            this.M = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.N = true;
            this.O = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.P = true;
            this.Q = ueu;
        }
        if (objectInput.readBoolean()) {
            ueu = new ueu();
            ueu.readExternal(objectInput);
            this.R = true;
            this.S = ueu;
        }
        this.T = objectInput.readUTF();
        this.l = objectInput.readInt();
        this.m = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.U = true;
            this.V = readUTF;
        }
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.W = true;
            this.X = readUTF;
        }
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.n = true;
            this.o = readUTF;
        }
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.Y = true;
            this.p = readUTF;
        }
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.Z = true;
            this.q = readUTF;
        }
        this.r = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            uet uet = new uet();
            uet.readExternal(objectInput);
            this.s.add(uet);
        }
        readInt = objectInput.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            uet uet2 = new uet();
            uet2.readExternal(objectInput);
            this.t.add(uet2);
        }
        this.aa = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.u = true;
            this.v = readUTF;
        }
        this.ab = objectInput.readBoolean();
        this.ac = objectInput.readBoolean();
    }
}
