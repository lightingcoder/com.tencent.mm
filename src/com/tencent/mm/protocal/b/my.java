package com.tencent.mm.protocal.b;

import java.util.LinkedList;

public final class my
  extends ali
{
  public int eiL;
  public String jkD;
  public String jkE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (jGS != null)
      {
        paramVarArgs.cj(1, jGS.kn());
        jGS.a(paramVarArgs);
      }
      paramVarArgs.ci(2, eiL);
      if (jkD != null) {
        paramVarArgs.d(3, jkD);
      }
      if (jkE != null) {
        paramVarArgs.d(4, jkE);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (jGS == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = a.a.a.a.ch(1, jGS.kn()) + 0;; paramInt = 0)
    {
      int i = paramInt + a.a.a.a.cg(2, eiL);
      paramInt = i;
      if (jkD != null) {
        paramInt = i + a.a.a.b.b.a.e(3, jkD);
      }
      i = paramInt;
      if (jkE != null) {
        i = paramInt + a.a.a.b.b.a.e(4, jkE);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], iTR);
        for (paramInt = ali.a(paramVarArgs); paramInt > 0; paramInt = ali.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.bog();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        my localmy = (my)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new dc();
            localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
            for (boolean bool = true; bool; bool = ((dc)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, ali.a((a.a.a.a.a)localObject2))) {}
            jGS = ((dc)localObject1);
            paramInt += 1;
          }
        case 2: 
          eiL = maU.jC();
          return 0;
        case 3: 
          jkD = maU.readString();
          return 0;
        }
        jkE = maU.readString();
        return 0;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.my
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */