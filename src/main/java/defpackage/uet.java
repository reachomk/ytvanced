package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uet */
public final class uet implements Externalizable {
    public static final long serialVersionUID = 1;
    public String a;
    public String b;
    public final List c = new ArrayList();
    public String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private String h;

    public uet() {
        String str = "";
        this.a = str;
        this.b = str;
        this.d = str;
        this.f = false;
        this.h = str;
    }

    public final int a() {
        return this.c.size();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a);
        objectOutput.writeUTF(this.b);
        int a = a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutput.writeUTF((String) this.c.get(i));
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.d);
        }
        objectOutput.writeBoolean(this.g);
        if (this.g) {
            objectOutput.writeUTF(this.h);
        }
        objectOutput.writeBoolean(this.f);
    }

    public final void readExternal(ObjectInput objectInput) {
        String readUTF;
        this.a = objectInput.readUTF();
        this.b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.e = true;
            this.d = readUTF;
        }
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.g = true;
            this.h = readUTF;
        }
        this.f = objectInput.readBoolean();
    }
}
