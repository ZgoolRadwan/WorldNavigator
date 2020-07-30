package com.company.StrategyPattern.Lockable;

import com.company.Items.Key;

public class NoLock implements Lockable {

  @Override
  public Key getKey() {
    return null;
  }

  @Override
  public String unlock(Key key) {return "Object have not key";}

  @Override
  public void setLockKey(Key key) {}

  @Override
  public String makeLocked(Key key) {return "Object haven't lock";}

  @Override
  public boolean isLocked() {
    return false;
  }

  @Override
  public String lockType() {
    return "hasNotLock";
  }
}
