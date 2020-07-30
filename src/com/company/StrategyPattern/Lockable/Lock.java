package com.company.StrategyPattern.Lockable;

import com.company.Items.Key;

public class Lock implements Lockable {

  private boolean isLocked;
  private Key key;

  @Override
  public Key getKey() {
    return key;
  }

  @Override
  public String unlock(Key key) {
    if (this.key.getName().equals(key.getName())) {
      isLocked = false;
      return "unlocked.";
    } else {
      return "Not valid key";
    }
  }

  @Override
  public void setLockKey(Key key) {
    if (!key.getName().isEmpty()) {
      this.key = key;
      this.isLocked = true; // if you set key, by default will be locked.
    }
  }

  @Override
  public String makeLocked(Key key) {
    if (!key.getName().isEmpty() && key != null) {
      if (this.key.getName().equals(key.getName())) {
        isLocked = true;
        return "Locked.";
      } else {
        return "Not valid key";
      }
    } else return "Enter valid key";
  }

  @Override
  public boolean isLocked() {
    return isLocked;
  }

  @Override
  public String lockType() {
    return "hasLock";
  }

  @Override
  public String toString() {
    return "WithLock{" +
            "isLocked=" + isLocked +
            ", key='" + key + '\'' +
            '}';
  }
}
