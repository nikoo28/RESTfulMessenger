package com.nikoo28.restfulmessenger.resources;

import com.nikoo28.restfulmessenger.model.Profile;
import com.nikoo28.restfulmessenger.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by nikoo28 on 11/22/17 5:43 AM
 */
@Path("/profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResource {

  ProfileService profileService = new ProfileService();

  @GET
  public List<Profile> getProfiles() {
    return profileService.getAllProfiles();
  }

  @POST
  public Profile addProfile(Profile profile) {
    return profileService.addProfile(profile);
  }

  @GET
  @Path("/{profileName}")
  public Profile getProfile(@PathParam("profileName") String profileName) {
    return profileService.getProfile(profileName);
  }

  @PUT
  @Path("/{profileName}")
  public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile) {
    profile.setProfileName(profileName);
    return profileService.updateProfile(profile);
  }

  @DELETE
  @Path("/{profileName}")
  public void deleteProfile(@PathParam("profileName") String profileName) {
    profileService.removeProfile(profileName);
  }

}
