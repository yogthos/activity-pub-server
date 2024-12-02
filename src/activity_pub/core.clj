;; https://www.w3.org/TR/activitystreams-vocabulary
;; W3C Recommendation 23 May 2017

;; https://www.w3.org/TR/activitystreams-vocabulary/#types

(def core-types
  #:core.type {:object                  {:class         "Object"
                                         :uri           "https://www.w3.org/ns/activitystreams#Object"
                                         :disjoint-with #{:core.type/link}
                                         :properties    #{:property.type/attachment
                                                          :property.type/attributed-to
                                                          :property.type/audience
                                                          :property.type/content
                                                          :property.type/context
                                                          :property.type/name
                                                          :property.type/end-time
                                                          :property.type/generator
                                                          :property.type/icon
                                                          :property.type/image
                                                          :property.type/in-reply-to
                                                          :property.type/start-time
                                                          :property.type/summary
                                                          :property.type/tag
                                                          :property.type/updated
                                                          :property.type/url
                                                          :property.type/to
                                                          :property.type/bto
                                                          :property.type/cc
                                                          :property.type/bcc
                                                          :property.type/media-type
                                                          :property.type/duration}}
               :link                    {:class         "Link"
                                         :uri           "https://www.w3.org/ns/activitystreams#Link"
                                         :disjoint-with #{:core.type/object}
                                         :properties    #{:property.type/href
                                                          :property.type/rel
                                                          :property.type/media-type
                                                          :property.type/name
                                                          :property.type/hreflang
                                                          :property.type/height
                                                          :property.type/width
                                                          :property.type/preview}}
               :activity                {:class      "Activity"
                                         :uri        "https://www.w3.org/ns/activitystreams#Activity"
                                         :extends    #{:core.type/object}
                                         :properties #{:property.type/actor
                                                       :property.type/object
                                                       :property.type/target
                                                       :property.type/result
                                                       :property.type/origin
                                                       :property.type/instrument}}
               :intransitive-activity   {:class              "IntransitiveActivity"
                                         :uri                "https://www.w3.org/ns/activitystreams#IntransitiveActivity"
                                         :extends            #{:core.type/activity}
                                         :without-properties #{:property.type/object}}
               :collection              {:class      "Collection"
                                         :uri        "https://www.w3.org/ns/activitystreams#Collection"
                                         :extends    #{:core.type/object}
                                         :properties #{:property.type/total-items
                                                       :property.type/current
                                                       :property.type/first
                                                       :property.type/last
                                                       :property.type/items}}
               :ordered-collection      {:class   "OrderedCollection"
                                         :uri     "https://www.w3.org/ns/activitystreams#OrderedCollection"
                                         :extends #{:core.type/collection}}
               :collection-page         {:class      "CollectionPage"
                                         :uri        "https://www.w3.org/ns/activitystreams#CollectionPage"
                                         :extends    #{:core.type/collection}
                                         :properties #{:property.type/part-of
                                                       :property.type/next
                                                       :property.type/prev}}
               :ordered-collection-page {:class      "OrderedCollectionPage"
                                         :uri        "https://www.w3.org/ns/activitystreams#OrderedCollectionPage"
                                         :extends    #{:core.type/ordered-collection
                                                       :core.type/collection-page}
                                         :properties #{:property.type/start-index}}})


;; https://www.w3.org/TR/activitystreams-vocabulary/#extendedtypes

;; https://www.w3.org/TR/activitystreams-vocabulary/#activity-types
(def activity-types
  #:activity.type {:accept           {:class   "Accept"
                                      :uri     "https://www.w3.org/ns/activitystreams#Accept"
                                      :extends #{:core.type/activity}}
                   :add              {:class   "Add"
                                      :uri     "https://www.w3.org/ns/activitystreams#Add"
                                      :extends #{:core.type/activity}}
                   :announce         {:class   "Announce"
                                      :uri     "https://www.w3.org/ns/activitystreams#Announce"
                                      :extends #{:core.type/activity}}
                   :arrive           {:class   "Arrive"
                                      :uri     "https://www.w3.org/ns/activitystreams#Arrive"
                                      :extends #{:core.type/intransitive-activity}}
                   :block            {:class   "Block"
                                      :uri     "https://www.w3.org/ns/activitystreams#Block"
                                      :extends #{:activity.type/ignore}}
                   :create           {:class   "Create"
                                      :uri     "https://www.w3.org/ns/activitystreams#Create"
                                      :extends #{:core.type/activity}}
                   :delete           {:class   "Delete"
                                      :uri     "https://www.w3.org/ns/activitystreams#Delete"
                                      :extends #{:core.type/activity}}
                   :dislike          {:class   "Dislike"
                                      :uri     "https://www.w3.org/ns/activitystreams#Dislike"
                                      :extends #{:core.type/activity}}
                   :flag             {:class   "Flag"
                                      :uri     "https://www.w3.org/ns/activitystreams#Flag"
                                      :extends #{:core.type/activity}}
                   :follow           {:class   "Follow"
                                      :uri     "https://www.w3.org/ns/activitystreams#Follow"
                                      :extends #{:core.type/activity}}
                   :ignore           {:class   "Ignore"
                                      :uri     "https://www.w3.org/ns/activitystreams#Ignore"
                                      :extends #{:core.type/activity}}
                   :invite           {:class   "Invite"
                                      :uri     "https://www.w3.org/ns/activitystreams#Invite"
                                      :extends #{:activity.type/offer}}
                   :join             {:class   "Join"
                                      :uri     "https://www.w3.org/ns/activitystreams#Join"
                                      :extends #{:core.type/activity}}
                   :leave            {:class   "Leave"
                                      :uri     "https://www.w3.org/ns/activitystreams#Leave"
                                      :extends #{:core.type/activity}}
                   :like             {:class   "Like"
                                      :uri     "https://www.w3.org/ns/activitystreams#Like"
                                      :extends #{:core.type/activity}}
                   :listen           {:class   "Listen"
                                      :uri     "https://www.w3.org/ns/activitystreams#Listen"
                                      :extends #{:core.type/activity}}
                   :move             {:class   "Move"
                                      :uri     "https://www.w3.org/ns/activitystreams#Move"
                                      :extends #{:core.type/activity}}
                   :offer            {:class   "Offer"
                                      :uri     "https://www.w3.org/ns/activitystreams#Offer"
                                      :extends #{:core.type/activity}}
                   :question         {:class   "Question"
                                      :uri     "https://www.w3.org/ns/activitystreams#Question"
                                      :extends #{:core.type/intransitive-activity}}
                   :reject           {:class   "Reject"
                                      :uri     "https://www.w3.org/ns/activitystreams#Reject"
                                      :extends #{:core.type/activity}}
                   :read             {:class   "Read"
                                      :uri     "https://www.w3.org/ns/activitystreams#Read"
                                      :extends #{:core.type/activity}}
                   :remove           {:class   "Remove"
                                      :uri     "https://www.w3.org/ns/activitystreams#Remove"
                                      :extends #{:core.type/activity}}
                   :tentative-reject {:class   "TentativeReject"
                                      :uri     "https://www.w3.org/ns/activitystreams#TentativeReject"
                                      :extends #{:activity.type/reject}}
                   :tentative-accept {:class   "TentativeAccept"
                                      :uri     "https://www.w3.org/ns/activitystreams#TentativeAccept"
                                      :extends #{:activity.type/accept}}
                   :travel           {:class   "Travel"
                                      :uri     "https://www.w3.org/ns/activitystreams#Travel"
                                      :extends #{:core.type/intransitive-activity}}
                   :undo             {:class   "Undo"
                                      :uri     "https://www.w3.org/ns/activitystreams#Undo"
                                      :extends #{:core.type/activity}}
                   :update           {:class   "Update"
                                      :uri     "https://www.w3.org/ns/activitystreams#Update"
                                      :extends #{:core.type/activity}}
                   :view             {:class   "View"
                                      :uri     "https://www.w3.org/ns/activitystreams#View"
                                      :extends #{:core.type/activity}}})

;; https://www.w3.org/TR/activitystreams-vocabulary/#actor-types
(def actor-types
  #:actor.type {:application  {:class "Application"
                               :uri "https://www.w3.org/ns/activitystreams#Application"
                               :extends #{:core.type/object}}
                :group        {:class "Group"
                               :uri "https://www.w3.org/ns/activitystreams#Group"
                               :extends #{:core.type/object}}
                :organization {:class "Organization"
                               :uri "https://www.w3.org/ns/activitystreams#Organization"
                               :extends #{:core.type/object}}
                :person       {:class "Person"
                               :uri "https://www.w3.org/ns/activitystreams#Person"
                               :extends #{:core.type/object}}
                :service      {:class "Service"
                               :uri "https://www.w3.org/ns/activitystreams#Service"
                               :extends #{:core.type/object}}})

;; https://www.w3.org/TR/activitystreams-vocabulary/#object-types
(def object-types
  #:object.type {:article      {:class "Article"
                                :uri "https://www.w3.org/ns/activitystreams#Article"
                                :extends #{:core.type/object}}
                 :audio        {:class "Audio"
                                :uri "https://www.w3.org/ns/activitystreams#Audio"
                                :extends #{:object.type/document}}
                 :document     {:class "Document"
                                :uri "https://www.w3.org/ns/activitystreams#Document"
                                :extends #{:core.type/object}}
                 :event        {:class "Event"
                                :uri "https://www.w3.org/ns/activitystreams#Event"
                                :extends #{:core.type/object}}
                 :image        {:class "Image"
                                :uri "https://www.w3.org/ns/activitystreams#Image"
                                :extends #{:object.type/document}}
                 :note         {:class "Note"
                                :uri "https://www.w3.org/ns/activitystreams#Note"
                                :extends #{:core.type/object}}
                 :page         {:class "Page"
                                :uri "https://www.w3.org/ns/activitystreams#Page"
                                :extends #{:object.type/document}}
                 :place        {:class "Place"
                                :uri "https://www.w3.org/ns/activitystreams#Place"
                                :extends #{:core.type/object}
                                :properties #{:property.type/accuracy
                                              :property.type/altitude
                                              :property.type/latitude
                                              :property.type/longitude
                                              :property.type/radius
                                              :property.type/units}}
                 :profile      {:class "Profile"
                                :uri "https://www.w3.org/ns/activitystreams#Profile"
                                :extends #{:core.type/object}
                                :properties #{:property.type/describes}}
                 :relationship {:class "Relationship"
                                :uri "https://www.w3.org/ns/activitystreams#Relationship"
                                :extends #{:core.type/object}
                                :properties #{:property.type/subject
                                              :property.type/object
                                              :property.type/relationship}}
                 :tombstone    {:class "Tombstone"
                                :uri "https://www.w3.org/ns/activitystreams#Tombstone"
                                :extends #{:core.type/object}
                                :properties #{:property.type/former-type
                                              :property.type/deleted}}
                 :video        {:class "Video"
                                :uri "https://www.w3.org/ns/activitystreams#Video"
                                :extends #{:object.type/document}}
                 :mention      {:class "Mention"
                                :url "https://www.w3.org/ns/activitystreams#Mention"
                                :extends #{:core.type/link}}})

