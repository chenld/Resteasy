package org.jboss.resteasy.skeleton.key.model.data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class User implements Serializable
{
   private static final long serialVersionUID = 1L;
   protected String id;
   protected String username;
   protected boolean enabled;

   public String getId()
   {
      return id;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public String getUsername()
   {
      return username;
   }

   public void setUsername(String username)
   {
      this.username = username;
   }

   public boolean isEnabled()
   {
      return enabled;
   }

   public void setEnabled(boolean enabled)
   {
      this.enabled = enabled;
   }
}
